package main.clients;

import java.time.LocalDate;

public class Penguin extends Animal{
    public Penguin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Penguin() {
        super();
    }
    @Override
    public void toFly() {
        System.out.println((animalType() + " не умеет летать"));
    }
}
