package main.staff;

import main.clients.Illness;
import main.clients.animals.Animal;

public interface Prescriptable {
    void prescription(Animal animal, Illness illness);
}
