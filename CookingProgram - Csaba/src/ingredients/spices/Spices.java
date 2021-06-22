package ingredients.spices;

import ingredients.Ingredients;

public class Spices extends Ingredients {

    private boolean needsToBeClean = false;

    public Spices(String name, double amount) {
        super(name, amount, "gram", "powder");
    }

    public boolean isNeedsToBeClean() {
        return needsToBeClean;
    }

    public void setNeedsToBeClean(boolean needsToBeClean) {
        this.needsToBeClean = needsToBeClean;
    }
}
