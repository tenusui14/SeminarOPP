package main.clients;
import main.clients.VeterinaryClinic;
import main.clients.animals.*;
import main.staff.Doctor;
import main.staff.Worker;

import java.util.ArrayList;
import java.util.List;

import static main.clients.VeterinaryClinic.*;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Worker> staff = new ArrayList<>();

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

        VeterinaryClinic vetClinic = new VeterinaryClinic(staff, patients);

        List<Animal> swimmers = new ArrayList<>(vetClinic.getSwimmers());
        System.out.println(swimmers);
        List<Animal> flyers = new ArrayList<>(vetClinic.getFlyers());
        System.out.println(flyers);
        List<Animal> runners = new ArrayList<>(vetClinic.getRunners());
        System.out.println(runners);

    }
}
