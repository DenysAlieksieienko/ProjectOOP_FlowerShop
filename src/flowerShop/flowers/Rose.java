package flowerShop.flowers;

/**
 *
 */
public class Rose extends RealFlower {
    private boolean withThorns;       //true with protect

    public Rose(double price, int length, double fresh, boolean type) {
        super(price, length, fresh);
        this.withThorns = type;
    }

    public boolean isWithThorns() {
        return withThorns;
    }

    public void setWithThorns(boolean withThorns) {
        this.withThorns = withThorns;
    }

    @Override
    public String toString() {
        return "Rose "+(withThorns ? "with thorns. ":"without thorns. ")+
               "Price "+getPrice()+
               ", Length "+getLength()+
               ", Fresh "+getFresh()+"\n";
    }

}
