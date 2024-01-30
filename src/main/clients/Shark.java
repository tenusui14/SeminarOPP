package main.clients;

import java.time.LocalDate;

public class Shark extends Animal {
    public Shark(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Shark() {
        super();
    }
    @Override
    public void toFly() {
        System.out.println((animalType() + " не умеет летать"));
    }

    @Override
    public void toGo() {
        System.out.println(animalType() + " не умеет ходить");
    }
}
