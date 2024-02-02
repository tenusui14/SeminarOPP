package main.staff;

import main.clients.Illness;
import main.clients.animals.Animal;

public class Doctor extends Worker implements Prescriptable, Operateable {

    protected String prescription;


    public Doctor(String name, String post) {
        super(name, post);
    }

    public Doctor(String name) {
        super(name);
    }


    @Override
    public void operate(Animal animal) {
        System.out.println("Doctor operates=");
    }

    @Override
    public void prescription(Animal animal, Illness illness) {
        System.out.println("Doctor gives prescription");
    }
}
