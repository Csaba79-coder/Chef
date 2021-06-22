import actitvities.KitchenActivities;
import recipe.ChickenWithVegetables;
import recipe.Lecso;

public class MainCsaba {

    public static void main(String[] args) {

        System.out.println("----------------Lecsó--------------------");

        Lecso lecso = new Lecso();
        KitchenActivities kitchenActivities = new KitchenActivities(lecso.getIngredients());

        kitchenActivities.makeAllSteps();

        System.out.println("----------------------------------------------------");
        System.out.println("--------------Chicken with Vegetables---------------");
        System.out.println("----------------------------------------------------\n");
        ChickenWithVegetables chickenWithVegetables = new ChickenWithVegetables();
        kitchenActivities.setIngredients(chickenWithVegetables.getIngredients());

        kitchenActivities.makeAllSteps();
    }
}
