package ingredients.rawmaterial;


public class Water extends RawMaterial {


    public Water(String name, double amount, String type, String brand) {
        super(name, amount, "dl", "liquid", false, true);
        this.activities = new String[]{"cook"};
    }
}
