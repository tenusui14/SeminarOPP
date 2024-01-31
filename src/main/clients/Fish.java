package main.clients;

import java.time.LocalDate;

public class Fish extends Animal {

    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Рыба поймала малька и ест");
    }

    /* HW1
    @Override
    public void toFly() {
        System.out.println((animalType() + " не умеет летать"));
    }
    @Override
    public void toGo() {
        System.out.println(animalType() + " не умеет ходить");
        }
     */

    }

