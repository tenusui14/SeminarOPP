package main.clients.animals;

import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public class Penguin extends Animal implements Goable, Swimable {
    public Penguin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Penguin() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Пингвин поймал несколько рыб и устроил себе сытный обед");
    }


    @Override
    public void toGo() {
        System.out.println(nickName + " бежит куда-то");
    }

    @Override
    public double getRunSpeed() {
        return 8;
    }

    @Override
    public void toSwim() {
        System.out.println(nickName + " нырнул в воду и поплыл");
    }

    @Override
    public double getSwimSpeed() {
        return 10;
    }
}
