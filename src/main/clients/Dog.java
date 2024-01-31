package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака грызет кость");
    }

    @Override
    public void toGo() {
        System.out.println("Собака куда-то побежала");
    }
/* HW1
    @Override
    public void toFly() {
        System.out.println((animalType() + " не умеет летать"));
}
 */
    }

