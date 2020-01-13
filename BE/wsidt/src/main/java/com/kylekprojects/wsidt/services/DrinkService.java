package com.kylekprojects.wsidt.services;

import java.util.HashMap;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.kylekprojects.wsidt.dto.APIResponseDTO;
import com.kylekprojects.wsidt.models.Drink;
import com.kylekprojects.wsidt.models.EmptyResponseException;
import com.kylekprojects.wsidt.models.Ingredient;
@Service
public class DrinkService {
	private static String baseUrl = "https://www.thecocktaildb.com/api/json/v1/1";
	@Autowired
	private RestTemplate restTemplate;
	
	public HashSet<Drink> getDrinksByName(String name) {
		MultiValueMap<String,String> paramMap =  new LinkedMultiValueMap<String,String>();
		paramMap.add("s", name);
		return this.sendAPIRequest("/search.php", paramMap).getBody().convertToDrinkList();
	}
	public Drink getDrinkById(int id) throws EmptyResponseException {
		MultiValueMap<String,String> paramMap =  new LinkedMultiValueMap<String,String>();
		paramMap.add("i",String.valueOf(id) );
		HashSet<Drink> drinks = this.sendAPIRequest("/lookup.php", paramMap).getBody().convertToDrinkList();
		if(drinks.size() == 0) { throw new EmptyResponseException("/ingredients/" + id,"Resource Not Found"); };
		return drinks.iterator().next();
	}
	public Drink getRandomDrink() throws EmptyResponseException{
		MultiValueMap<String,String> paramMap =  new LinkedMultiValueMap<String,String>();
		HashSet<Drink> drinks = this.sendAPIRequest("/random.php", paramMap).getBody().convertToDrinkList();
		if(drinks.size() == 0) { throw new EmptyResponseException("/drink/random","Resource Not Found"); };
		return drinks.iterator().next();
	}
	public HashSet<Drink> getDrinksByIngredients(String[] ingredients) throws EmptyResponseException{
		MultiValueMap<String,String> paramMap =  new LinkedMultiValueMap<String,String>();
		paramMap.add("i",ingredients[0]);
		HashSet<Drink> drinks = this.sendAPIRequest("/filter.php", paramMap).getBody().convertToDrinkList();
		if(drinks.size() == 0) { throw new EmptyResponseException("/drink/random","Resource Not Found"); };
		if(ingredients.length > 1) {
			HashSet<Drink> filteredDrinks = new HashSet<Drink>();
			drinks.forEach(drink -> {
				//Create ingredient map with boolean values to check each drink if they contain all ingredients
				HashMap<String,Boolean> ingredientLogicMap = new HashMap<String, Boolean>();
				int ingredientsLen = ingredients.length;
				for(int i = 0; i < ingredientsLen; i++) {
					ingredientLogicMap.put(ingredients[i], false);
				}
				//Check against ingredientMap to see if ingredients array contains all ingredients.
				drink.getIngredients().forEach(ingredient -> {
					if(ingredientLogicMap.containsKey(ingredient.getName())) {
						ingredientLogicMap.replace(ingredient.getName(), true);
					}
				});
				//If ingredientLogicMap has all true values, add to filtered array
				filteredDrinks.add(drink);
			});
			return filteredDrinks;
		}
		return drinks;
	}
	public HashSet<Ingredient> getIngredientByName(String name) {
		MultiValueMap<String,String> paramMap =  new LinkedMultiValueMap<String,String>();
		paramMap.add("i", name);
		return this.sendAPIRequest("/search.php", paramMap).getBody().convertToIngredientList();
	}
	public HashSet<Ingredient> getIngredientsList() {
		MultiValueMap<String,String> paramMap =  new LinkedMultiValueMap<String,String>();
		paramMap.add("i", "list");
		return this.sendAPIRequest("/list.php", paramMap).getBody().convertToIngredientList();
	}
	public Ingredient getIngredientById(int id) throws EmptyResponseException {
		MultiValueMap<String,String> paramMap =  new LinkedMultiValueMap<String,String>();
		paramMap.add("iid", String.valueOf(id));
		HashSet<Ingredient> ingredients = this.sendAPIRequest("/lookup.php", paramMap).getBody().convertToIngredientList();
		if(ingredients.size() == 0) { throw new EmptyResponseException("/ingredients/" + id,"Resource Not Found"); };
		return ingredients.iterator().next();

	}
	
	
	
	private ResponseEntity<?> sendAPIRequest(String path, MultiValueMap<String,String> params, Class<?> objectClass ){
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(DrinkService.baseUrl + path)
		        .queryParams(params);
		System.out.println("Logging API Request to: " + builder.toUriString());
		HttpEntity<?> entity = new HttpEntity<>(headers);
	    ResponseEntity<?> response = restTemplate.exchange(builder.toUriString(),HttpMethod.GET, entity,
                objectClass);	

		return response;
	}
	private ResponseEntity<APIResponseDTO> sendAPIRequest(String path, MultiValueMap<String,String> params ){
		return (ResponseEntity<APIResponseDTO>) this.sendAPIRequest(path, params, APIResponseDTO.class);
	}
}
