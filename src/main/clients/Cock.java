package main.clients;

import java.time.LocalDate;

public class Cock extends Animal{
    public Cock(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Cock() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Петуху насыпали пшена и он не спеша клюет");
    }

    /* HW1
    public void toSwim() {
        System.out.println(animalType() + " не умеет плавать");
    }
    public void toFly() {
        System.out.println((animalType() + " летает крайне сомнительно"));
}
     */
}
