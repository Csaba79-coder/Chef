package ingredients.rawmaterial;

public class Chicken extends RawMaterial {


    public Chicken(String name, double amount, boolean needsToBeClean, boolean isCut) {
        super(name, amount, "kg", "whole", needsToBeClean, isCut);

        this.activities = new String[]{"uncleaned", "uncut", "uncooked"};

    }



}
