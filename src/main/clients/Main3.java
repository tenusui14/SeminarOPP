package main.clients;
import main.clients.VeterinaryClinic;
import main.clients.animals.*;
import main.staff.Doctor;

import java.util.ArrayList;

import static main.clients.VeterinaryClinic.*;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Animal> patients = new ArrayList<>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cock cock = new Cock();
        Duck duck = new Duck();
        Hawk hawk = new Hawk();
        Penguin peng = new Penguin();
        Shark shark = new Shark();

        patients.add(cat);
        patients.add(dog);
        patients.add(cock);
        patients.add(duck);
        patients.add(hawk);
        patients.add(peng);
        patients.add(shark);

        VeterinaryClinic vetClinic = new VeterinaryClinic();

        Doctor example = new Doctor("Sss SSS");
        vetClinic.getStaffList();
        vetClinic.getSwimmers(patients);
        vetClinic.getFlyers(patients);
        vetClinic.getRunners(patients);
        vetClinic.getStaffCount();
    }
}
