package flowerShop.flowers;

/**
 *
 */
abstract public class Flower implements Comparable<Flower>{
    private double price;
    private int length;

    public Flower(double price, int length) {
        this.price = price;
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
