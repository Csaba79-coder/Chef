package ingredients.rawmaterial;

public class Oil extends RawMaterial {

    private String type;
    private String brand;

    public Oil(String name, double amount, String type, String brand) {
        super(name, amount, "dl", "liquid", false, true);
        this.type = type;
        this.brand = brand;
        this.activities = new String[]{"cook"};
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
