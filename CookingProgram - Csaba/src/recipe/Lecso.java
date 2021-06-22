package recipe;

import ingredients.rawmaterial.*;
import ingredients.spices.*;
import ingredients.*;


public class Lecso {


    Paprika paprikaSweet = new Paprika("paprikaSweet", 0.5, "green", false, "regular TV");
    Paprika paprikaHot = new Paprika("paprikaHot", 0.5, "red and green", true, "Bogyiszló");
    Tomato tomato = new Tomato("tomato", 0.5, "red");

    Onion onion = new Onion("onion", 2, "bronze red","regular");

    Egg egg = new Egg("egg", 6, "farm", "XL");

    Pepper pepper = new Pepper("pepper", 1, "black");
    Salt salt = new Salt("salt", 1,"iod", true);
    PaprikaPowder paprikaPowder = new PaprikaPowder("paprikaPowder", 5, "red", true, "Kalocsa");

    Oil oil = new Oil("oil", 1, "olive, extra virgin", "Bertolli");
    Water water = new Water("water", 1, "tapped", "none");

    Sausage sausage = new Sausage("sausage", 1, "Gyulai", true, true);


    Ingredients[] lecsos = {tomato, paprikaHot, paprikaSweet, onion, egg, sausage, salt, pepper, water, oil, paprikaPowder};

    public Ingredients[] getIngredients() {
        return lecsos;
    }
}
