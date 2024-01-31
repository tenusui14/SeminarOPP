package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable{

    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }


    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и кушает");
    }

    @Override
    public void toGo() {
        System.out.println("Кошка куда-то побежала");
    }


//
//    @Override
//    public String toString() {
//        return super.toString() + ", скидка: (" + discount + "%)";
//    }
//
//    @Override
//    public void toFly() {
//        System.out.println((animalType() + " не умеет летать"));
//}
    }

