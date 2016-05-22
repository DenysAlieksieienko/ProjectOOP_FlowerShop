package flowerShop.acsesuars;

/**
 * Class Acsesuar
 */
public class Acsesuar {
    private String name;
    private double price;

    //create free of charge acsesuar
    public Acsesuar() {
        price=0;
        name="Acsesuar";
    }

    public Acsesuar(String name) {
        this();
        this.name = name;
    }

    public Acsesuar(double price) {
        this();
        this.price = price;
    }

    public Acsesuar(String name, double price) {
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
