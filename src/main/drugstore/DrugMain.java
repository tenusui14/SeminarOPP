package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

public class DrugMain {
    public static void main(String[] args) {
        Component water = new Water("water", 10D, 1);
        Component azitronite = new Azitronite("azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);


        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);

//        Iterator<Component> iterator = p1;
//        Iterator<Component> iterator2 = p2;
//
//        while(iterator.hasNext()){
//            System.out.println(p1.next().toString());
//        }
//        while(iterator2.hasNext()){
//            System.out.println(p2.next().toString());
//        }
        for (Component c :p2){
            System.out.println(c);
        }

    }
}
