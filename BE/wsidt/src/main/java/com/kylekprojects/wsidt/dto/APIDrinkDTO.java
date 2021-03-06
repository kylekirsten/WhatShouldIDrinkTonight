package com.kylekprojects.wsidt.dto;

import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kylekprojects.wsidt.models.Drink;
import com.kylekprojects.wsidt.models.DrinkInfo;
import com.kylekprojects.wsidt.models.DrinkIngredient;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APIDrinkDTO {
	private int idDrink;
	private String strDrink;
	private String strDrinkAlternate;
	private String strTags;
	private String strVideo;
	private String strCategory;
	private String strlBA;
	private String strAlcoholic;
	private String strGlass;
	private String strInstructions;
	private String strDrinkThumb;
	private String strIngredient1;
	private String strIngredient2;
	private String strIngredient3;
	private String strIngredient4;
	private String strIngredient5;
	private String strIngredient6;
	private String strIngredient7;
	private String strIngredient8;
	private String strIngredient9;
	private String strIngredient10;
	private String strIngredient11;
	private String strIngredient12;
	private String strIngredient13;
	private String strIngredient14;
	private String strIngredient15;
	private String strMeasure1;
	private String strMeasure2;
	private String strMeasure3;
	private String strMeasure4;
	private String strMeasure5;
	private String strMeasure6;
	private String strMeasure7;
	private String strMeasure8;
	private String strMeasure9;
	private String strMeasure10;
	private String strMeasure11;
	private String strMeasure12;
	private String strMeasure13;
	private String strMeasure14;
	private String strMeasure15;
	private String strCreativeCommonsConfirmed;
	private String dateModified;
	public int getIdDrink() {
		return idDrink;
	}
	public void setIdDrink(int idDrink) {
		this.idDrink = idDrink;
	}
	public String getStrDrink() {
		return strDrink;
	}
	public void setStrDrink(String strDrink) {
		this.strDrink = strDrink;
	}
	public String getStrDrinkAlternate() {
		return strDrinkAlternate;
	}
	public void setStrDrinkAlternate(String strDrinkAlternate) {
		this.strDrinkAlternate = strDrinkAlternate;
	}
	public String getStrTags() {
		return strTags;
	}
	public void setStrTags(String strTags) {
		this.strTags = strTags;
	}
	public String getStrVideo() {
		return strVideo;
	}
	public void setStrVideo(String strVideo) {
		this.strVideo = strVideo;
	}
	public String getStrCategory() {
		return strCategory;
	}
	public void setStrCategory(String strCategory) {
		this.strCategory = strCategory;
	}
	public String getStrlBA() {
		return strlBA;
	}
	public void setStrlBA(String strlBA) {
		this.strlBA = strlBA;
	}
	public String getStrAlcoholic() {
		return strAlcoholic;
	}
	public void setStrAlcoholic(String strAlcoholic) {
		this.strAlcoholic = strAlcoholic;
	}
	public String getStrGlass() {
		return strGlass;
	}
	public void setStrGlass(String strGlass) {
		this.strGlass = strGlass;
	}
	public String getStrInstructions() {
		return strInstructions;
	}
	public void setStrInstructions(String strInstructions) {
		this.strInstructions = strInstructions;
	}
	public String getStrDrinkThumb() {
		return strDrinkThumb;
	}
	public void setStrDrinkThumb(String strDrinkThumb) {
		this.strDrinkThumb = strDrinkThumb;
	}
	public String getStrIngredient1() {
		return strIngredient1;
	}
	public void setStrIngredient1(String strIngredient1) {
		this.strIngredient1 = strIngredient1;
	}
	public String getStrIngredient2() {
		return strIngredient2;
	}
	public void setStrIngredient2(String strIngredient2) {
		this.strIngredient2 = strIngredient2;
	}
	public String getStrIngredient3() {
		return strIngredient3;
	}
	public void setStrIngredient3(String strIngredient3) {
		this.strIngredient3 = strIngredient3;
	}
	public String getStrIngredient4() {
		return strIngredient4;
	}
	public void setStrIngredient4(String strIngredient4) {
		this.strIngredient4 = strIngredient4;
	}
	public String getStrIngredient5() {
		return strIngredient5;
	}
	public void setStrIngredient5(String strIngredient5) {
		this.strIngredient5 = strIngredient5;
	}
	public String getStrIngredient6() {
		return strIngredient6;
	}
	public void setStrIngredient6(String strIngredient6) {
		this.strIngredient6 = strIngredient6;
	}
	public String getStrIngredient7() {
		return strIngredient7;
	}
	public void setStrIngredient7(String strIngredient7) {
		this.strIngredient7 = strIngredient7;
	}
	public String getStrIngredient8() {
		return strIngredient8;
	}
	public void setStrIngredient8(String strIngredient8) {
		this.strIngredient8 = strIngredient8;
	}
	public String getStrIngredient9() {
		return strIngredient9;
	}
	public void setStrIngredient9(String strIngredient9) {
		this.strIngredient9 = strIngredient9;
	}
	public String getStrIngredient10() {
		return strIngredient10;
	}
	public void setStrIngredient10(String strIngredient10) {
		this.strIngredient10 = strIngredient10;
	}
	public String getStrIngredient11() {
		return strIngredient11;
	}
	public void setStrIngredient11(String strIngredient11) {
		this.strIngredient11 = strIngredient11;
	}
	public String getStrIngredient12() {
		return strIngredient12;
	}
	public void setStrIngredient12(String strIngredient12) {
		this.strIngredient12 = strIngredient12;
	}
	public String getStrIngredient13() {
		return strIngredient13;
	}
	public void setStrIngredient13(String strIngredient13) {
		this.strIngredient13 = strIngredient13;
	}
	public String getStrIngredient14() {
		return strIngredient14;
	}
	public void setStrIngredient14(String strIngredient14) {
		this.strIngredient14 = strIngredient14;
	}
	public String getStrIngredient15() {
		return strIngredient15;
	}
	public void setStrIngredient15(String strIngredient15) {
		this.strIngredient15 = strIngredient15;
	}
	public String getStrMeasure1() {
		return strMeasure1;
	}
	public void setStrMeasure1(String strMeasure1) {
		this.strMeasure1 = strMeasure1;
	}
	public String getStrMeasure2() {
		return strMeasure2;
	}
	public void setStrMeasure2(String strMeasure2) {
		this.strMeasure2 = strMeasure2;
	}
	public String getStrMeasure3() {
		return strMeasure3;
	}
	public void setStrMeasure3(String strMeasure3) {
		this.strMeasure3 = strMeasure3;
	}
	public String getStrMeasure4() {
		return strMeasure4;
	}
	public void setStrMeasure4(String strMeasure4) {
		this.strMeasure4 = strMeasure4;
	}
	public String getStrMeasure5() {
		return strMeasure5;
	}
	public void setStrMeasure5(String strMeasure5) {
		this.strMeasure5 = strMeasure5;
	}
	public String getStrMeasure6() {
		return strMeasure6;
	}
	public void setStrMeasure6(String strMeasure6) {
		this.strMeasure6 = strMeasure6;
	}
	public String getStrMeasure7() {
		return strMeasure7;
	}
	public void setStrMeasure7(String strMeasure7) {
		this.strMeasure7 = strMeasure7;
	}
	public String getStrMeasure8() {
		return strMeasure8;
	}
	public void setStrMeasure8(String strMeasure8) {
		this.strMeasure8 = strMeasure8;
	}
	public String getStrMeasure9() {
		return strMeasure9;
	}
	public void setStrMeasure9(String strMeasure9) {
		this.strMeasure9 = strMeasure9;
	}
	public String getStrMeasure10() {
		return strMeasure10;
	}
	public void setStrMeasure10(String strMeasure10) {
		this.strMeasure10 = strMeasure10;
	}
	public String getStrMeasure11() {
		return strMeasure11;
	}
	public void setStrMeasure11(String strMeasure11) {
		this.strMeasure11 = strMeasure11;
	}
	public String getStrMeasure12() {
		return strMeasure12;
	}
	public void setStrMeasure12(String strMeasure12) {
		this.strMeasure12 = strMeasure12;
	}
	public String getStrMeasure13() {
		return strMeasure13;
	}
	public void setStrMeasure13(String strMeasure13) {
		this.strMeasure13 = strMeasure13;
	}
	public String getStrMeasure14() {
		return strMeasure14;
	}
	public void setStrMeasure14(String strMeasure14) {
		this.strMeasure14 = strMeasure14;
	}
	public String getStrMeasure15() {
		return strMeasure15;
	}
	public void setStrMeasure15(String strMeasure15) {
		this.strMeasure15 = strMeasure15;
	}
	public String getStrCreativeCommonsConfirmed() {
		return strCreativeCommonsConfirmed;
	}
	public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) {
		this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
	}
	public String getDateModified() {
		return dateModified;
	}
	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}
	@Override
	public String toString() {
		return "APIDrinkDTO [idDrink=" + idDrink + ", strDrink=" + strDrink + ", strDrinkAlternate=" + strDrinkAlternate
				+ ", strTags=" + strTags + ", strVideo=" + strVideo + ", strCategory=" + strCategory + ", strlBA="
				+ strlBA + ", strAlcoholic=" + strAlcoholic + ", strGlass=" + strGlass + ", strInstructions="
				+ strInstructions + ", strDrinkThumb=" + strDrinkThumb + ", strIngredient1=" + strIngredient1
				+ ", strIngredient2=" + strIngredient2 + ", strIngredient3=" + strIngredient3 + ", strIngredient4="
				+ strIngredient4 + ", strIngredient5=" + strIngredient5 + ", strIngredient6=" + strIngredient6
				+ ", strIngredient7=" + strIngredient7 + ", strIngredient8=" + strIngredient8 + ", strIngredient9="
				+ strIngredient9 + ", strIngredient10=" + strIngredient10 + ", strIngredient11=" + strIngredient11
				+ ", strIngredient12=" + strIngredient12 + ", strIngredient13=" + strIngredient13 + ", strIngredient14="
				+ strIngredient14 + ", strIngredient15=" + strIngredient15 + ", strMeasure1=" + strMeasure1
				+ ", strMeasure2=" + strMeasure2 + ", strMeasure3=" + strMeasure3 + ", strMeasure4=" + strMeasure4
				+ ", strMeasure5=" + strMeasure5 + ", strMeasure6=" + strMeasure6 + ", strMeasure7=" + strMeasure7
				+ ", strMeasure8=" + strMeasure8 + ", strMeasure9=" + strMeasure9 + ", strMeasure10=" + strMeasure10
				+ ", strMeasure11=" + strMeasure11 + ", strMeasure12=" + strMeasure12 + ", strMeasure13=" + strMeasure13
				+ ", strMeasure14=" + strMeasure14 + ", strMeasure15=" + strMeasure15 + ", strCreativeCommonsConfirmed="
				+ strCreativeCommonsConfirmed + ", dateModified=" + dateModified + "]";
	}
	public Drink convertToDrink() {
		Drink drink = new Drink();
		drink.setId(this.idDrink);
		drink.setAlcoholic(this.strAlcoholic == "Alcoholic");
		drink.setCategory(this.strCategory);
		drink.setName(this.strDrink);
		
		//Set drinkInfo obj
		DrinkInfo drinkInfo = new DrinkInfo();
		drinkInfo.setAlternateName(this.strDrinkAlternate);
		drinkInfo.setCreativeCommons(this.strCreativeCommonsConfirmed != "No");
		drinkInfo.setIba(this.strlBA);
		drinkInfo.setTags(this.strTags);
		drinkInfo.setThumbnail(this.strDrinkThumb);
		drinkInfo.setVideo(this.strVideo);
		
		drink.setOther(drinkInfo);
		
		//Set Ingredients obj
		HashSet<DrinkIngredient> ingredients = new HashSet<DrinkIngredient>();
		if(this.strIngredient1 != null) {
			DrinkIngredient dI1 = new DrinkIngredient();
			dI1.setAmount(this.strMeasure1);
			dI1.setName(this.strIngredient1);
			ingredients.add(dI1);
		}
		if(this.strIngredient2 != null) {
			DrinkIngredient dI2 = new DrinkIngredient();
			dI2.setAmount(this.strMeasure2);
			dI2.setName(this.strIngredient2);
			ingredients.add(dI2);
		}
		if(this.strIngredient3 != null) {
			DrinkIngredient dI3 = new DrinkIngredient();
			dI3.setAmount(this.strMeasure3);
			dI3.setName(this.strIngredient3);
			ingredients.add(dI3);
		}
		if(this.strIngredient4 != null) {
			DrinkIngredient dI4 = new DrinkIngredient();
			dI4.setAmount(this.strMeasure4);
			dI4.setName(this.strIngredient4);
			ingredients.add(dI4);
		}
		if(this.strIngredient5 != null) {
			DrinkIngredient dI5 = new DrinkIngredient();
			dI5.setAmount(this.strMeasure5);
			dI5.setName(this.strIngredient5);
			ingredients.add(dI5);
		}
		if(this.strIngredient6 != null) {
			DrinkIngredient dI6 = new DrinkIngredient();
			dI6.setAmount(this.strMeasure6);
			dI6.setName(this.strIngredient6);
			ingredients.add(dI6);
		}
		if(this.strIngredient7 != null) {
			DrinkIngredient dI7 = new DrinkIngredient();
			dI7.setAmount(this.strMeasure7);
			dI7.setName(this.strIngredient7);
			ingredients.add(dI7);
		}
		if(this.strIngredient8 != null) {
			DrinkIngredient dI8 = new DrinkIngredient();
			dI8.setAmount(this.strMeasure8);
			dI8.setName(this.strIngredient8);
			ingredients.add(dI8);
		}
		if(this.strIngredient9 != null) {
			DrinkIngredient dI9 = new DrinkIngredient();
			dI9.setAmount(this.strMeasure1);
			dI9.setName(this.strIngredient1);
			ingredients.add(dI9);
		}
		if(this.strIngredient10 != null) {
			DrinkIngredient dI10 = new DrinkIngredient();
			dI10.setAmount(this.strMeasure10);
			dI10.setName(this.strIngredient10);
			ingredients.add(dI10);
		}
		if(this.strIngredient11 != null) {
			DrinkIngredient dI11 = new DrinkIngredient();
			dI11.setAmount(this.strMeasure11);
			dI11.setName(this.strIngredient11);
			ingredients.add(dI11);
		}
		if(this.strIngredient12 != null) {
			DrinkIngredient dI12 = new DrinkIngredient();
			dI12.setAmount(this.strMeasure12);
			dI12.setName(this.strIngredient12);
			ingredients.add(dI12);
		}
		if(this.strIngredient13 != null) {
			DrinkIngredient dI13 = new DrinkIngredient();
			dI13.setAmount(this.strMeasure13);
			dI13.setName(this.strIngredient13);
			ingredients.add(dI13);
		}
		if(this.strIngredient14 != null) {
			DrinkIngredient dI14 = new DrinkIngredient();
			dI14.setAmount(this.strMeasure14);
			dI14.setName(this.strIngredient14);
			ingredients.add(dI14);
		}
		if(this.strIngredient15 != null) {
			DrinkIngredient dI15 = new DrinkIngredient();
			dI15.setAmount(this.strMeasure15);
			dI15.setName(this.strIngredient15);
			ingredients.add(dI15);
		}
		
		drink.setIngredients(ingredients);
		
		return drink;
	}

}
