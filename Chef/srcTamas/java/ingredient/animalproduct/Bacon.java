package ingredient.animalproduct;

import ingredient.Ingredient;

public class Bacon extends Ingredient {
    public Bacon(int quantity) {
        this.name = "Bacon";
        this.quantity = quantity;
        this.peppery = quantity * (4);
    }
}
