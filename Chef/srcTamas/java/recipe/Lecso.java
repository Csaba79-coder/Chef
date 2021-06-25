package recipe;

import controller.RecipeProcessor;
import ingredient.*;
import ingredient.animalproduct.Bacon;
import ingredient.animalproduct.Egg;
import spice.Chili;
import spice.Pepper;
import spice.Spice;
import ingredient.vegetables.Onion;
import ingredient.vegetables.Paprika;
import ingredient.vegetables.Tomato;
import utils.LogUtils;

public class Lecso  {
    int basicSaltLvl = 3;

    public void process(int eggQuantity, int peppery) {
        LogUtils.printRecipe("Lecsó");
        Ingredient[] ingredients = {
                new Onion(eggQuantity/2),
                new Paprika(eggQuantity),
                new Tomato(eggQuantity),
                new Egg(eggQuantity),
                new Bacon(eggQuantity)};

        Spice[] spices = {
                new Pepper(),
                new Chili()
        };

        RecipeProcessor lecsoProcessor =
                new RecipeProcessor(ingredients, spices, peppery, basicSaltLvl);

        LogUtils.printBonApetit();
    }

}

