package actitvities;

import ingredients.Ingredients;
import tools.Knife;
import tools.Stove;

public class KitchenActivities {

    Ingredients[] ingredients;
    Knife knife = new Knife("knife", "metal", 1, true, "Kitchen");
    Stove electricStove = new tools.Stove("electricStove", false, 4, "pieces");


    public KitchenActivities(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    //  needsToBeClean if true make a clean!
    // isNeedsToBeClean() return true or false ...

    public void cleanIngredients() {
        for (Ingredients ingredient : ingredients) {
            String[] activities = ingredient.getActivities();
        }
    }

    //         this.activities = new String[]{"uncleaned", "uncut", "uncooked"};

    private void cleanTheStuff() {
        for (int i = 0; i < ingredients.length; i++) {
            String[] activities = ingredients[i].getActivities();
            // System.out.print(ingredients[i].getName() + " ");
            for (int j = 0; j < activities.length; j++) {
                if (activities[j] == "uncleaned") {
                    activities[j] = activities[j].substring(2);
                    System.out.println(ingredients[i].getName() + " " + activities[j]);
                }
            }
        }
    }

    private void cutTheStuff() {
        for (int i = 0; i < ingredients.length; i++) {
            String[] activities = ingredients[i].getActivities();
            // System.out.print(ingredients[i].getName() + " ");
            for (int j = 0; j < activities.length; j++) {
                if (activities[j] == "uncut") {
                    activities[j] = knife.useKnife();
                    System.out.println(ingredients[i].getName() + " " + activities[j] );
                }
            }
        }
    }

    private void cookTheStuff() {
        for (int i = 0; i < ingredients.length; i++) {
            String[] activities = ingredients[i].getActivities();
            // System.out.print(ingredients[i].getName() + " ");
            for (int j = 0; j < activities.length; j++) {
                if (activities[j] == "uncooked") {
                    activities[j] = electricStove.cook();
                    System.out.println(ingredients[i].getName() + " " + activities[j]);
                }
            }
        }
    }

    public void makeAllSteps() {
        System.out.println("Cleaning process started:");
        cleanTheStuff();
        System.out.println("\n");
        System.out.println("Cutting all the elements for food:");
        cutTheStuff();
        System.out.println("\n");
        System.out.println("Cooking them altogether:");
        cookTheStuff();
        System.out.println("\nThe food is ready!");
    }
}