package tools;

import ingredients.rawmaterial.Tomato;

public class Stove {
    private String name;
    private boolean isGas;
    private int cookTop;
    private String unit;
    final String state = "cooked";

    public Stove(String name, boolean isGas, int cookTop, String unit) {
        this.name = name;
        this.isGas = isGas;
        this.cookTop = cookTop;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGas() {
        return isGas;
    }

    public void setGas(boolean gas) {
        isGas = gas;
    }

    public int getCookTop() {
        return cookTop;
    }

    public void setCookTop(int cookTop) {
        this.cookTop = cookTop;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String cook() { return state; }


    public void concassé(Tomato item, Knife knife) {
        item.setState("peeled and " + knife.useKnife());
    }
}
