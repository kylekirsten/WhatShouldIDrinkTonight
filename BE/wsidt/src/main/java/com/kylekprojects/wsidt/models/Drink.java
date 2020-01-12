package com.kylekprojects.wsidt.models;

import java.util.HashSet;

public class Drink {
	private int id;
	private String name;
	private String category;
	private String glass;
	private boolean isAlcoholic;
	private DrinkInfo other;
	private HashSet<DrinkIngredient> ingredients;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGlass() {
		return glass;
	}
	public void setGlass(String glass) {
		this.glass = glass;
	}
	public boolean isAlcoholic() {
		return isAlcoholic;
	}
	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}
	public DrinkInfo getOther() {
		return other;
	}
	public void setOther(DrinkInfo other) {
		this.other = other;
	}
	public HashSet<DrinkIngredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(HashSet<DrinkIngredient> ingredients) {
		this.ingredients = ingredients;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((glass == null) ? 0 : glass.hashCode());
		result = prime * result + id;
		result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
		result = prime * result + (isAlcoholic ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((other == null) ? 0 : other.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drink other = (Drink) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (glass == null) {
			if (other.glass != null)
				return false;
		} else if (!glass.equals(other.glass))
			return false;
		if (id != other.id)
			return false;
		if (ingredients == null) {
			if (other.ingredients != null)
				return false;
		} else if (!ingredients.equals(other.ingredients))
			return false;
		if (isAlcoholic != other.isAlcoholic)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (this.other == null) {
			if (other.other != null)
				return false;
		} else if (!this.other.equals(other.other))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Drink [id=" + id + ", name=" + name + ", category=" + category + ", glass=" + glass + ", isAlcoholic="
				+ isAlcoholic + ", other=" + other + ", ingredients=" + ingredients + "]";
	}
	public Drink(int id, String name, String category, String glass, boolean isAlcoholic, DrinkInfo other,
			HashSet<DrinkIngredient> ingredients) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.glass = glass;
		this.isAlcoholic = isAlcoholic;
		this.other = other;
		this.ingredients = ingredients;
	}
	public Drink() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
