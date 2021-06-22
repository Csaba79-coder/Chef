package controller;

import ingredient.*;
import spice.Spice;
import utils.LogUtils;

public class RecipeProcessor {
    IngredientProcessor ingredientProcessor = new IngredientProcessor();
    SpiceProcessor spiceProcessor = new SpiceProcessor();
    HeatProcessor heatProcessor = new HeatProcessor();

    public RecipeProcessor(Ingredient[] ingredients, Spice[] spices, int peppery, int basicSaltLvl) {
        LogUtils.printTitle("Preparing ingredients");
        ingredientProcessor.prepareIngredients(ingredients);
        LogUtils.printTitle("Add spices");
        spiceProcessor.addSpices(ingredients, spices, peppery, basicSaltLvl);
        LogUtils.printTitle("Heating ingredients");
        heatProcessor.heatIngredients(ingredients);
    }

}
