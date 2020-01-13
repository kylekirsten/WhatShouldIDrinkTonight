package com.kylekprojects.wsidt.controllers;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kylekprojects.wsidt.models.Drink;
import com.kylekprojects.wsidt.models.EmptyResponseException;
import com.kylekprojects.wsidt.models.Ingredient;
import com.kylekprojects.wsidt.services.DrinkService;

@Controller
@RequestMapping("wsidt")
public class WSIDTController {
	@Autowired
	private DrinkService drinkService; 
	
	@GetMapping("test")
	public String TestMethod() {
		return "Controller Works";
	}
	@GetMapping("drinks/name/{name}")
	public ResponseEntity<HashSet<Drink>> getAllDrinksByName(@PathVariable String name) {
		return new ResponseEntity<HashSet<Drink>>(this.drinkService.getDrinksByName(name),HttpStatus.OK);
	}
	@GetMapping("drinks/id/{id}")
	public ResponseEntity<Drink> getDrinkById(@PathVariable int id) throws EmptyResponseException {
		return new ResponseEntity<Drink>(this.drinkService.getDrinkById(id),HttpStatus.OK);
	}
	@GetMapping("drinks/random")
	public ResponseEntity<Drink> getRandomDrink() throws EmptyResponseException {
		return new ResponseEntity<Drink>(this.drinkService.getRandomDrink(),HttpStatus.OK);
	}
	@GetMapping("drink/ingredient/{ingredients}")
	public ResponseEntity<HashSet<Drink>> getDrinksByIngredients(@PathVariable String[] ingredients) throws EmptyResponseException {
		return new ResponseEntity<HashSet<Drink>>(this.drinkService.getDrinksByIngredients(ingredients),HttpStatus.OK);
	}
	
	@GetMapping("ingredients/name/{name}")
	public ResponseEntity<HashSet<Ingredient>> getIngredientByName(@PathVariable String name) {
		return new ResponseEntity<HashSet<Ingredient>>(this.drinkService.getIngredientByName(name),HttpStatus.OK);
	}
	@GetMapping("ingredients/list")
	public ResponseEntity<HashSet<Ingredient>> getIngredientList() {
		return new ResponseEntity<HashSet<Ingredient>>(this.drinkService.getIngredientsList(),HttpStatus.OK);
	}
	@GetMapping("ingredients/id/{id}")
	public ResponseEntity<Ingredient> getIngredientById(@PathVariable int id) throws EmptyResponseException {
		return new ResponseEntity<Ingredient>(this.drinkService.getIngredientById(id),HttpStatus.OK);
	}
	 @ExceptionHandler(EmptyResponseException.class)
	 public ResponseEntity<String> badRequest(Exception ex) {
		return ResponseEntity
			  .status(404)
			  .body("Identifier not found for that id");
	  }
}
