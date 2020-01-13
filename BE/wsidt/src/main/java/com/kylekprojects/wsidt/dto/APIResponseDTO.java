package com.kylekprojects.wsidt.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kylekprojects.wsidt.models.Drink;
import com.kylekprojects.wsidt.models.Ingredient;

public class APIResponseDTO {
    @JsonProperty("drinks")
	private List<APIDrinkDTO> drinks;
    @JsonProperty("ingredients")
    private List<APIIngredientDTO> ingredients;
    
	public List<APIDrinkDTO> getDrinks() {
		return drinks;
	}

	public void setDrinks(List<APIDrinkDTO> drinks) {
		this.drinks = drinks;
	}
	public List<APIIngredientDTO> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<APIIngredientDTO> ingredients) {
		this.ingredients = ingredients;
	}



	@Override
	public String toString() {
		return "APIResponseDTO [drinks=" + drinks + ", ingredients=" + ingredients + "]";
	}

	public HashSet<Drink> convertToDrinkList() {
		HashSet<Drink> drinks = new HashSet<Drink>();
		if(this.drinks != null && this.drinks.size() > 0) {
			this.drinks.stream().forEach(drink -> {
				drinks.add(drink.convertToDrink());
			});
		}
		return drinks;
	}
	public HashSet<Ingredient> convertToIngredientList() {
		HashSet<Ingredient> ingredients = new HashSet<Ingredient>();
		if(this.ingredients != null && this.ingredients.size() > 0) {
			this.ingredients.stream().forEach(ingredient -> {
				ingredients.add(ingredient.convertToIngredient());
			});
		}
		return ingredients;
	}
	
	
}
