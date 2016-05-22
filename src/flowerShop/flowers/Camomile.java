package flowerShop.flowers;

import flowerShop.flowers.RealFlower;

/**
 *
 */
public class Camomile extends RealFlower {
    private int leavesNumbers;

    public Camomile(double price, int length, double fresh, int leavesNumbers) {
        super(price, length, fresh);
        this.leavesNumbers = leavesNumbers;
    }

    public int getLeavesNumbers() {
        return leavesNumbers;
    }

    public void setLeavesNumbers(int leavesNumbers) {
        this.leavesNumbers = leavesNumbers;
    }

    @Override
    public String toString() {
        return "Camomile with " + leavesNumbers +" leaves. "+
                "Price "+getPrice()+
                ", Length "+getLength()+
                ", Fresh "+getFresh()+"\n";
    }
}
