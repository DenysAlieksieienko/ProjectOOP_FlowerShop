package flowerShop;

import flowerShop.acsesuars.Acsesuar;
import flowerShop.flowers.*;

import java.util.Arrays;
import java.util.Random;

/**
 *
 */
public class Bouquet {
    private Acsesuar[] acsesuars;
    private Flower[] flowers;
    private double BouquetCost;
    private Random random=new Random();

    public Bouquet(Acsesuar[] acsesuars, Flower[] flowers) {
        this.acsesuars = acsesuars;
        this.flowers = flowers;
    }

    public Bouquet(Acsesuar[] acsesuarsForRandom, Flower[] flowersForRandom,
                   int numbersOfAcsesuars, int numberOfFlowers) {
        acsesuars=new Acsesuar[numbersOfAcsesuars];
        flowers=new Flower[numberOfFlowers];
        int index;

        for (int i=0; i<numbersOfAcsesuars; i++){
            index=random.nextInt(acsesuarsForRandom.length-1);
            acsesuars[i]=acsesuarsForRandom[index];
        }

        for(int i=0; i<numberOfFlowers; i++){
            index=random.nextInt(flowersForRandom.length-1);
            flowers[i]=flowersForRandom[index];
        }
    }

    public Acsesuar[] getAcsesuars() {
        return acsesuars;
    }

    public void setAcsesuars(Acsesuar[] acsesuars) {
        this.acsesuars = acsesuars;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public double getBouquetCost(){
        BouquetCost =0.0;
        for (int i=0; i<acsesuars.length; i++){
            BouquetCost +=acsesuars[i].getPrice();
        }
        for(int i=0; i<flowers.length; i++){
            BouquetCost +=flowers[i].getPrice();
        }
        return BouquetCost;
    }

    public void sortByFresh(){
        double bestFresh, nextFlowerFresh;
        Flower tempFlower;

        for(int i=0; i<flowers.length-1; i++){

            if(flowers[i] instanceof RealFlower){
                RealFlower rf = (RealFlower) flowers[i];
                bestFresh = rf.getFresh();
            } else bestFresh = -1.0;

            for(int j=i+1; j<flowers.length; j++){				//find next more fresh flower
                if(flowers[j] instanceof RealFlower){
                    RealFlower rf = (RealFlower) flowers[j];
                    nextFlowerFresh = rf.getFresh();
                } else nextFlowerFresh = -1.0;

                if(nextFlowerFresh>bestFresh) {
                    tempFlower=flowers[i];                      //change
                    flowers[i]=flowers[j];
                    flowers[j]=tempFlower;
                }
            }
        }
    }

    public void findFlower(int minLength, int maxLength){
        boolean isFlowerFind = false;

        for(int i=0; i<flowers.length; i++){
            if( minLength <= flowers[i].getLength() && flowers[i].getLength() <= maxLength ){
                if(flowers[i] instanceof UnrealFlower){
                    System.out.println(((UnrealFlower) flowers[i]).toString());
                }
                if(flowers[i] instanceof Camomile){
                    Camomile c = (Camomile) flowers[i];
                    System.out.println(c.toString());
                }
                if(flowers[i] instanceof Rose) {
                    Rose r = (Rose) flowers[i];
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

        System.out.print("\nFlowers: "+flowers[0]);

        for(int i=1;i<flowers.length;i++){
            System.out.print("\t\t " + flowers[i]);
        }
        System.out.println("Coast: "+getBouquetCost());
        System.out.println("------------------------------------------------------------------");
    }
}
