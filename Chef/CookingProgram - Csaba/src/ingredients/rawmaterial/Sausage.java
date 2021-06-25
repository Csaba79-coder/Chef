package ingredients.rawmaterial;


public class Sausage extends RawMaterial {

    private String type;
    private boolean isSmoked;
    private boolean isHot;

    public Sausage(String name, double amount, String type, boolean isSmoked, boolean isHot) {
        super(name, amount, "pair", "whole", true, false);
        this.type = type;
        this.isSmoked = isSmoked;
        this.isHot = isHot;
        this.activities = new String[]{"uncleaned", "uncut", "uncooked"};
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSmoked() {
        return isSmoked;
    }

    public void setSmoked(boolean smoked) {
        isSmoked = smoked;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }
}
