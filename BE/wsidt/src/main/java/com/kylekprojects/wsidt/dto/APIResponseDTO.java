package com.kylekprojects.wsidt.dto;

import java.util.Arrays;

public class APIResponseDTO {
	private APIDrinkDTO[] drinks;

	public APIDrinkDTO[] getDrinks() {
		return drinks;
	}

	public void setDrinks(APIDrinkDTO[] drinks) {
		this.drinks = drinks;
	}

	@Override
	public String toString() {
		return "APIResponseDTO [drinks=" + Arrays.toString(drinks) + "]";
	}
}
