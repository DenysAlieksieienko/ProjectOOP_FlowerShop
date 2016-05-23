package flowerShop.accessory;

/**
 * Class Accessory
 */
public class Accessory {
    private String name;
    private double price;

    //create free of charge accessory
    public Accessory() {
        price=0;
        name="Accessory";
    }

    public Accessory(String name) {
        this();
        this.name = name;
    }

    public Accessory(double price) {
        this();
        this.price = price;
    }

    public Accessory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
