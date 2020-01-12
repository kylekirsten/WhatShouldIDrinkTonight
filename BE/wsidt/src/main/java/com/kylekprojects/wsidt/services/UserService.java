package com.kylekprojects.wsidt.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.kylekprojects.wsidt.models.User;
import com.kylekprojects.wsidt.utils.MiscUtils;
import com.kylekprojects.wsidt.utils.PasswordEncrypt;
@Service
public class UserService implements UserDetailsService{
	@Autowired
	UserRepository usersRepository;
	
	public User createUser(User user) {
		System.out.println("USER CREATED WITH UID: " + user.getUserId());
		String oldpassword = user.getPassword();
		user.setPassword(PasswordEncrypt.encrypt(oldpassword));
		return usersRepository.save(user);
	}
	public Page<User> listAll(Pageable pageable) {
		System.out.println("ALL USERS SELECTED");
		return usersRepository.findAll(pageable);
	}
	public User getById(int id) {
		System.out.println("USER SELECTED WITH UID: " + id);
		return usersRepository.findById(id)
				.orElseThrow(() -> 
				new HttpClientErrorException(HttpStatus.NOT_FOUND));
	}
	public User updateUser(int id, User user) {
		System.out.println("USER UPDATED WITH PARAMS: " + user.toString());
		User oldUser = usersRepository.findById(id).orElseThrow(() ->
		new HttpClientErrorException(HttpStatus.NOT_FOUND));
		User newUser = (User) MiscUtils.merge(oldUser, user);
		//Save the product
		String oldpassword = newUser.getPassword();
		newUser.setPassword(PasswordEncrypt.encrypt(oldpassword));
		return usersRepository.save(newUser);
		//Retrieve it again to show joined values correctly
		//return usersRepository.findById(id).orElseThrow(() ->
		//new HttpClientErrorException(HttpStatus.NOT_FOUND));
	}
	public String deleteUser(int id) {
		System.out.println("USER DELETED WITH UID: " + id);
		if(usersRepository.existsById(id)) {
			usersRepository.deleteById(id);
			return "DELETED USER WITH UID: " + id;
		} else {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
	}
	public Page<User> performSearch(Specification<User> spec, Pageable pageable) {
		return usersRepository.findAll(spec, pageable);
	}
	public User getUserByUsername(String username) {
		User user = usersRepository.findByUsername(username);
		return user;
	}
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = usersRepository.findByUsername(username);
        Collection<GrantedAuthority> roleArray = new ArrayList<GrantedAuthority>();
        roleArray.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), roleArray);
    }

}