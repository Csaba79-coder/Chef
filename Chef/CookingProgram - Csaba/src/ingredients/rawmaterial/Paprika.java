package ingredients.rawmaterial;


public class Paprika extends RawMaterial {

    private String color;
    private boolean isHot;
    private String type;

    public Paprika(String name, double amount, String color, boolean isHot, String type) {
        super(name, amount, "kg", "whole", true, false);
        this.color = color;
        this.isHot = isHot;
        this.type = type;
        this.activities = new String[]{"uncleaned", "uncut", "uncooked"};
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
