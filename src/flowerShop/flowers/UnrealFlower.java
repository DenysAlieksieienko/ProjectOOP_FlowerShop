package flowerShop.flowers;

/**
 *
 */
public class UnrealFlower extends Flower {
    private String material;

    public UnrealFlower(double price, int length, String material) {
        super(price, length);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString(){
        return material+" unreal flower. "+
               "Price "+getPrice()+
               ", Length "+getLength()+"\n";
    }

    @Override
    public int compareTo(Flower flower) {
        return (flower instanceof RealFlower) ? -1:0;
    }
}
