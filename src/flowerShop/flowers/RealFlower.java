package flowerShop.flowers;

/**
 *
 */
public abstract class RealFlower extends Flower {
    private Double fresh;               // 1...10

    public RealFlower(double price, int length, double fresh) {
        super(price, length);
        if (fresh<1){this.fresh=1.0;}
        else if (fresh>10){this.fresh=10.0;}
        else {this.fresh=fresh;}
    }

    public double getFresh() {
        return fresh;
    }

    @Override
    public int compareTo(Flower flower) {
        if (flower instanceof RealFlower){
            return fresh.compareTo( ((RealFlower) flower).fresh);
            //return ((RealFlower) flower).fresh.compareTo(fresh);
        }else return 1;
    }
}
