package flowerShop.flowers;

/**
 *
 */
public class RealFlower extends Flower {
    private double fresh;               // 1...10

    public RealFlower(double price, int length, double fresh) {
        super(price, length);
        if (fresh<1){this.fresh=1.0;}
        else if (fresh>10){this.fresh=10.0;}
        else {this.fresh=fresh;}
    }

    public double getFresh() {
        return fresh;
    }
}
