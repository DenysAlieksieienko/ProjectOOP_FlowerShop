package flowerShop;

import flowerShop.accessory.Accessory;
import flowerShop.flowers.*;

import java.util.*;

/**
 *
 */
public class Bouquet {
    private List<Accessory> accessories;
    private List<Flower> flowers;
    private double BouquetCost;
    private Random random=new Random();

    public Bouquet(List<Accessory> accessories,  List<Flower> flowers) {
        this.accessories = accessories;
        this.flowers = flowers;
    }

    public Bouquet(List<Accessory> acsesuarsForRandom, List<Flower> flowersForRandom,
                   int numbersOfAcsesuars, int numberOfFlowers) {
        accessories =new ArrayList<Accessory>();
        flowers=new ArrayList<Flower>();
        int index;

        for (int i=0; i<numbersOfAcsesuars; i++){
            index=random.nextInt(acsesuarsForRandom.size()-1);
            accessories.add(acsesuarsForRandom.get(index));
        }

        for(int i=0; i<numberOfFlowers; i++){
            index=random.nextInt(flowersForRandom.size()-1);
            flowers.add(flowersForRandom.get(index));
        }
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public double getBouquetCost(){
        BouquetCost =0.0;
        for (int i=0; i< accessories.size(); i++){
            BouquetCost += accessories.get(i).getPrice();
        }
        for(int i=0; i<flowers.size(); i++){
            BouquetCost +=flowers.get(i).getPrice();
        }
        return BouquetCost;
    }

    public void sortByFresh(){                  //use comparator
        Collections.sort(flowers);
    }

    public void findFlower(int minLength, int maxLength){
        boolean isFlowerFind = false;

        for(int i=0; i<flowers.size(); i++){
            if( minLength <= flowers.get(i).getLength() && flowers.get(i).getLength() <= maxLength ){
                if(flowers.get(i) instanceof UnrealFlower){
                    System.out.println(((UnrealFlower) flowers.get(i)).toString());
                }
                if(flowers.get(i) instanceof Camomile){
                    Camomile c = (Camomile) flowers.get(i);
                    System.out.println(c.toString());
                }
                if(flowers.get(i) instanceof Rose) {
                    Rose r = (Rose) flowers.get(i);
                    System.out.println(r.toString());
                }
                isFlowerFind = true;
            }
        }

        if(!isFlowerFind) System.out.println("Not found any flower in this range!!!");
    }

    public void print(){
        System.out.println("\t\t*****   Bouquet   *****");
        System.out.print("Acsesuars: ");
        for (int i=0;i< accessories.size();i++){
            System.out.print(accessories.get(i) + ((i == accessories.size() - 1) ? "" : ", "));
        }

        System.out.print("\nFlowers: "+flowers.get(0));

        for(int i=1;i<flowers.size();i++){
            System.out.print("\t\t " + flowers.get(i));
        }
        System.out.println("Coast: "+getBouquetCost());
        System.out.println("------------------------------------------------------------------");
    }
}
