package main.clients;

import java.time.LocalDate;

public class Shark extends Animal implements Swimable{
    public Shark(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Shark() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Акула наткнулась на мясистую рыбу и перекусывает");
    }


    @Override
    public void toSwim() {
        System.out.println(nickName + " поплыла куда-то");
    }

    @Override
    public double getSwimSpeed() {
        return 15;
    }
}

