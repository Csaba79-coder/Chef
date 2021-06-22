package ingredients.rawmaterial;


public class Tomato extends RawMaterial {

    private String color;


    public Tomato(String name, double amount, String color) {
        super(name, amount, "kg", "whole", true, false);
        this.color = color;
        this.activities = new String[]{"uncleaned", "uncut", "uncooked"};
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
