package com.kylekprojects.wsidt.controllers;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.kylekprojects.wsidt.models.User;
import com.kylekprojects.wsidt.security.JwtTokenProvider;
import com.kylekprojects.wsidt.services.UserService;

@RestController
@RequestMapping("users")
@CrossOrigin
public class UserController {
	UserService usersService;
	@Autowired
	private JwtTokenProvider jwtTokenProvider;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	public UserController(UserService usersService) {
		this.usersService = usersService;
	}
	@PostMapping("")
	public  User createUser(@RequestBody User user) {
		User newUser = usersService.createUser(user);
		return newUser;
	}
	@GetMapping("")
	public Page<User> getAllUsers(Pageable pageable) {
		Page<User> userList = usersService.listAll(pageable);
		return userList;
	}
	@PatchMapping("")
	public  User updateUser(@RequestBody User user) {
		User updatedUser = usersService.updateUser(user.getUserId(), user);
		return updatedUser;
	}
	@DeleteMapping("/{id}")
	public String deleteUserById(@PathVariable int id) {
		String result = usersService.deleteUser(id);
		return result;
	}
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		User user = usersService.getById(id);
		return user;
	}
	@PostMapping("/login")
	public HashMap<String,String> loginUser(@RequestBody Map<String, String> json) {
		String username = json.get("username");
		String password = json.get("password");
		String token;
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            token = jwtTokenProvider.createToken(username);
          } catch (AuthenticationException e) {
          	throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED, "Invalid username/password");
          }
		User user = usersService.getUserByUsername(username);
		System.out.println("User logged in: " + user.getUsername());
		HashMap<String, String> response = new HashMap<String, String>();
		response.put("userid", String.valueOf(user.getUserId()));
		response.put("username", user.getUsername());
		response.put("firstname", user.getFirstname());
		response.put("lastname", user.getLastname());
		response.put("email", user.getEmail());
		response.put("phone", user.getPhone());
		response.put("rating", String.valueOf(user.getRating()));
		response.put("token", token);
		return response;
	}
//    @GetMapping("/search")
//    public Page<User> search(@RequestParam(value = "query") String search, Pageable pageable) {
//        GenericFilterBuilder<Users> builder = new GenericFilterBuilder<Users>();
//        Pattern pattern = Pattern.compile("(\\w+?)(:|<|>|!)(\\w+?),");
//        Matcher matcher = pattern.matcher(search + ",");
//        while (matcher.find()) {
//            builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
//        }
//         
//        Specification<Users> spec = builder.build();
//        return usersService.performSearch(spec, pageable);
//    }
	/* EXCEPTION HANDLERS */
//	  @ExceptionHandler({SQLException.class,DataAccessException.class})
//	  public ResponseEntity<String> databaseError() {
//		  return ResponseEntity
//				  .status(500)
//				  .body("Database Error");
//	  }
//	  @ExceptionHandler(HttpClientErrorException.class)
//	  public ResponseEntity<String> handleClientError(HttpClientErrorException e) {
//		  return ResponseEntity
//				  .status(e.getStatusCode())
//				  .body(e.getMessage());
//	  }
//	  
//	  @ExceptionHandler(HttpServerErrorException.class)
//	  public ResponseEntity<String> handleServerError(HttpServerErrorException e) {
//		  return ResponseEntity
//				  .status(e.getStatusCode())
//				  .body(e.getMessage());
//	  }
//	  @ExceptionHandler({NumberFormatException.class, HttpMessageNotReadableException.class,
//		  ConstraintViolationException.class,InvalidDataAccessApiUsageException.class})
//	  public ResponseEntity<String> badRequest(Exception ex) {
//		  System.out.println(ex.getMessage());
//		  return ResponseEntity
//				  .status(400)
//				  .body("Bad Parameters");
//	  }
}