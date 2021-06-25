package ingredients.rawmaterial;


public class Onion extends RawMaterial {

    private String color;
    private String type;

    public Onion(String name, double amount, String color, String type) {
        super(name, amount, "pieces", "whole", true, false);
        this.color = color;
        this.type = type;
        this.activities = new String[]{"uncleaned", "uncut", "uncooked"};
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
