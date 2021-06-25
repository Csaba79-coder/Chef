package ingredient.animalproduct;

import ingredient.Ingredient;

public class Egg extends Ingredient {
    public Egg(int quantity) {
        this.name = "Egg";
        this.quantity = quantity;
        this.peppery = quantity * (-6);
        this.toCut = false;
    }
}
