package flowerShop;

import flowerShop.acsesuars.Acsesuar;
import flowerShop.flowers.*;

import java.util.*;

/**
 *
 */
public class Bouquet {
    private Acsesuar[] acsesuars;
    private List<Flower> flowers;
    private double BouquetCost;
    private Random random=new Random();

    public Bouquet(Acsesuar[] acsesuars,  List<Flower> flowers) {
        this.acsesuars = acsesuars;
        this.flowers = flowers;
    }

    public Bouquet(Acsesuar[] acsesuarsForRandom, List<Flower> flowersForRandom,
                   int numbersOfAcsesuars, int numberOfFlowers) {
        acsesuars=new Acsesuar[numbersOfAcsesuars];
        flowers=new ArrayList<Flower>();
        int index;

        for (int i=0; i<numbersOfAcsesuars; i++){
            index=random.nextInt(acsesuarsForRandom.length-1);
            acsesuars[i]=acsesuarsForRandom[index];
        }

        for(int i=0; i<numberOfFlowers; i++){
            index=random.nextInt(flowersForRandom.size()-1);
            flowers.add(flowersForRandom.get(index));
        }
    }

    public Acsesuar[] getAcsesuars() {
        return acsesuars;
    }

    public void setAcsesuars(Acsesuar[] acsesuars) {
        this.acsesuars = acsesuars;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public double getBouquetCost(){
        BouquetCost =0.0;
        for (int i=0; i<acsesuars.length; i++){
            BouquetCost +=acsesuars[i].getPrice();
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
        System.out.print("Acsesuars: "+Arrays.toString(acsesuars));

        System.out.print("\nFlowers: "+flowers.get(0));

        for(int i=1;i<flowers.size();i++){
            System.out.print("\t\t " + flowers.get(i));
        }
        System.out.println("Coast: "+getBouquetCost());
        System.out.println("------------------------------------------------------------------");
    }
}
