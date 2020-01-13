package com.kylekprojects.wsidt.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.kylekprojects.wsidt.models.Ingredient;

public class APIIngredientDTO {
	    private int idIngredient;
	    private String strIngredient;
	    private String strDescription;
	    private String strType;
	    private String strAlcohol;
	    private int strABV;
		public int getIdIngredient() {
			return idIngredient;
		}
		public void setIdIngredient(int idIngredient) {
			this.idIngredient = idIngredient;
		}
		public String getStrIngredient() {
			return strIngredient;
		}
		public void setStrIngredient(String strIngredient) {
			this.strIngredient = strIngredient;
		}
		public String getStrDescription() {
			return strDescription;
		}
		public void setStrDescription(String strDescription) {
			this.strDescription = strDescription;
		}
		public String getStrType() {
			return strType;
		}
		public void setStrType(String strType) {
			this.strType = strType;
		}
		public String getStrAlcohol() {
			return strAlcohol;
		}
		public void setStrAlcohol(String strAlcohol) {
			this.strAlcohol = strAlcohol;
		}
		public int getStrABV() {
			return strABV;
		}
		public void setStrABV(int strABV) {
			this.strABV = strABV;
		}
		public Ingredient convertToIngredient() {
			Ingredient ingredient = new Ingredient();
			ingredient.setAbv(this.strABV);
			if(this.getStrAlcohol() != null && this.getStrAlcohol().equalsIgnoreCase("Yes")) {
				ingredient.setAlcoholic(true);
			} else {
				ingredient.setAlcoholic(false);
			}
			ingredient.setDescription(this.strDescription);
			ingredient.setId(this.idIngredient);
			ingredient.setName(this.strIngredient);
			ingredient.setType(this.strType);
			return ingredient;
		}
		@Override
		public String toString() {
			return "APIIngredientDTO [idIngredient=" + idIngredient + ", strIngredient=" + strIngredient
					+ ", strDescription=" + strDescription + ", strType=" + strType + ", strAlcohol=" + strAlcohol
					+ ", strABV=" + strABV + "]";
		}
		public APIIngredientDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
