package flowerShop;

import flowerShop.accessory.Accessory;
import flowerShop.flowers.Flower;
import flowerShop.flowers.Rose;
import flowerShop.flowers.Camomile;
import flowerShop.flowers.UnrealFlower;

import java.util.ArrayList;

/**
 * Created by Администратор on 17.05.16.
 */
public class FlowerShop {
    public static void main(String[] args) {
        System.out.println("\t\t***** Cvetochnitca *****\n");

        ArrayList<Accessory> accessories =new ArrayList<Accessory>();
        accessories.add(new Accessory());
        accessories.add(new Accessory("Wood branch"));
        accessories.add(new Accessory("Pearl"));

        ArrayList<Flower> flowers=new ArrayList<Flower>();
        flowers.add(new Rose(15, 30, 4, true));
        flowers.add(new Rose(18, 35, 6, false));
        flowers.add(new Rose(20, 40, 7, true));
        flowers.add(new Rose(25, 40, 8, false));
        flowers.add(new Rose(30, 45, 9, false));

        flowers.add(new Camomile(4, 20, 6, 33));
        flowers.add(new Camomile(8, 22, 8,	31));
        flowers.add(new Camomile(15, 25, 10, 30));

        flowers.add(new UnrealFlower(3.25, 22, "Plastic"));
        flowers.add(new UnrealFlower(4.25, 22, "Caton"));
        flowers.add(new UnrealFlower(8.25, 22, "Capron"));

        Bouquet b1=new Bouquet(accessories,flowers);
        Bouquet b2=new Bouquet(accessories,flowers,3,4);

        b2.print();
        b2.sortByFresh();
        b2.print();
//        b2.findFlower(30,50);

    }
}
