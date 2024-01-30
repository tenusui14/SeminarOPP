package main.clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void toFly() {
        System.out.println((animalType() + " не умеет летать"));
    }
}
