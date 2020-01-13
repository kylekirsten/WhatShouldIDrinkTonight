package com.kylekprojects.wsidt.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingredient {
    private int id;
    private String name;
    private String description;
    private String type;
    private boolean alcoholic;
    private int abv;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isAlcoholic() {
		return alcoholic;
	}
	public void setAlcoholic(boolean alcoholic) {
		this.alcoholic = alcoholic;
	}
	public int getAbv() {
		return abv;
	}
	public void setAbv(int abv) {
		this.abv = abv;
	}
	public Ingredient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", description=" + description + ", type=" + type
				+ ", alcoholic=" + alcoholic + ", abv=" + abv + "]";
	}
	
    
}
