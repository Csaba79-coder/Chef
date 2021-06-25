package ingredient.vegetables;

import ingredient.Ingredient;

public class Tomato extends Ingredient {
    public Tomato(int quantity) {
        this.name = "Tomato";
        this.quantity = quantity;
        this.peppery = quantity * (-4);
    }
}
