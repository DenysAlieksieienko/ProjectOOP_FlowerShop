package flowerShop;

import flowerShop.acsesuars.Acsesuar;
import flowerShop.flowers.Flower;
import flowerShop.flowers.Rose;
import flowerShop.flowers.Camomile;
import flowerShop.flowers.UnrealFlower;

/**
 * Created by Администратор on 17.05.16.
 */
public class FlowerShop {
    public static void main(String[] args) {
        System.out.println("\t\t***** Cvetochnitca *****\n");

        Acsesuar a1,a2,a3;
        a1=new Acsesuar();
        a2=new Acsesuar("Wood branch");
        a3=new Acsesuar("Pearl");

        Rose r1,r2,r3,r4,r5;
        r1 = new Rose(15, 30, 4, true);
        r2 = new Rose(18, 35, 6, false);
        r3 = new Rose(20, 40, 7, true);
        r4 = new Rose(25, 40, 8, false);
        r5 = new Rose(30, 45, 9, false);

        Camomile c1,c2,c3;
        c1 = new Camomile(4, 20, 6, 33);
        c2 = new Camomile(8, 22, 8,	31);
        c3 = new Camomile(15, 25, 10, 30);

        UnrealFlower uf1,uf2,uf3;
        uf1 = new UnrealFlower(3.25, 22, "Plastic");
        uf2 = new UnrealFlower(4.25, 22, "Caton");
        uf3 = new UnrealFlower(8.25, 22, "Capron");

        Acsesuar []	acsesuars = {a1, a2, a3};
        Flower [] flowers = {r1,r2,r3,r4,r5,c1,c2,c3,uf1,uf2,uf3};

        Bouquet b1=new Bouquet(acsesuars,flowers);
        Bouquet b2=new Bouquet(acsesuars,flowers,3,4);

        b2.print();
        b2.sortByFresh();
        b2.print();
        //b2.findFlower(30,50);

    }
}
