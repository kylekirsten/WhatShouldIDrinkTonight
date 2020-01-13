import { DrinkInfo } from "./drink-info";
import { DrinkIngredient } from "./drink-ingredient";

export interface Drink {
    id : number;
    name : string;
    category: string;
    glass : string;
    isAlcoholic : boolean;
    other: DrinkInfo;
    ingredients : DrinkIngredient[];
}