package main.staff;
import main.clients.Illness;
import main.clients.animals.Animal;
public class Nurse extends Worker implements Injectionable, Careable {


    public Nurse(String name, String post) {
        super(name, post);
    }

    public Nurse(String name) {
        super(name);
    }


    @Override
    public void takeCare() {
        System.out.println("Nurse taking care of patient");
    }

    @Override
    public void inject() {
        System.out.println("Nurse making an injection");
    }
}
