package ingredients.rawmaterial;

public class Carrot extends RawMaterial {

    public Carrot(String name, double amount, boolean needsToBeClean, boolean isCut) {
        super(name, amount, "kg", "whole", needsToBeClean, isCut);

        this.activities = new String[]{"uncleaned", "uncut", "uncooked"};
    }
}
