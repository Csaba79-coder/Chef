package ingredients.spices;


public class PaprikaPowder extends Spices {

    private String color;
    private boolean isHot;
    private String type;

    public PaprikaPowder(String name, double amount, String color, boolean isHot, String type) {
        super(name, amount);
        this.color = color;
        this.isHot = isHot;
        this.type = type;
        this.activities = new String[]{"uncooked"};
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
