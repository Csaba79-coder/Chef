package kitchen_tool;

import ingredient.Ingredient;

public class Knife extends KitchenTool {

    public void processIngredient(Ingredient ingredient) {
        cut(ingredient);
    }

    private void cut(Ingredient ingredient) {
        if (ingredient.isToCut()) {
            ingredient.setState(Ingredient.STATE_CUT);
            System.out.println(ingredient.getName() + " is cut!");
        }
    }
}
