package recipe;

import ingredients.Ingredients;
import ingredients.rawmaterial.Carrot;
import ingredients.rawmaterial.Chicken;
import ingredients.rawmaterial.Paprika;
import ingredients.rawmaterial.*;
import ingredients.spices.ChickenSpiceMix;
import ingredients.spices.Pepper;
import ingredients.spices.Salt;


public class ChickenWithVegetables {

    Paprika paprikaCalifornia = new Paprika("paprikaCalifornia", 0.1, "red", false, "California");
    Paprika paprikaChilli = new Paprika("paprikaChilli", 0.05, "red", false, "Chilli");
    Chicken chickenBreast = new Chicken("chickenBreast", 0.8, true, false);
    Carrot carrot = new Carrot("carrot", 0.1, true, false);
    Onion leek = new Onion("leek", 0.1, "white", "leek-onion");
    Onion redOnion = new Onion ("redOnion", 0.1, "purple-red", "red onion");
    Pepper pepper = new Pepper("pepper", 1, "black");
    Pepper pepperCayenne = new Pepper("pepperCayenne", 1, "black");
    Salt salt = new Salt("salt", 1,"iod", true);
    ChickenSpiceMix chickenSpiceMix = new ChickenSpiceMix("chickenSpiceMix", 1);
    Oil oil = new Oil("oil", 1, "olive, extra virgin", "Bertolli");

    Ingredients[] chickenWithVegetables = {paprikaCalifornia, paprikaChilli, chickenBreast, carrot, leek, redOnion,
            pepper, pepperCayenne, salt, chickenSpiceMix, oil};

    public Ingredients[] getIngredients() {
        return chickenWithVegetables;
    }
}
