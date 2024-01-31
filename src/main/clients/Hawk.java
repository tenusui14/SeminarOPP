package main.clients;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Hawk extends Animal{
    public Hawk(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Hawk() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Ястреб поймал дичь и ест");
    }

/* HW1
    @Override
    public void toSwim() {
        System.out.println(animalType() + " не умеет плавать");
    }

    @Override
    public void toGo() {
        System.out.println(animalType() + " не умеет бегать");
}
 */
    }

