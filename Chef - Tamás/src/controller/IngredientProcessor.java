package controller;

import ingredient.Ingredient;
import kitchen_tool.Knife;
import kitchen_tool.Sink;

public class IngredientProcessor {

    Ingredient[] prepareIngredients(Ingredient[] ingredients) {
        Knife knife = new Knife();
        Sink sink = new Sink();

        for(Ingredient ingredient : ingredients) {
            System.out.println("Preparing " + ingredient.getQuantity() + " " + ingredient.getName());
            sink.processIngredient(ingredient);
            knife.processIngredient(ingredient);
        }
        return ingredients;
    }
}
