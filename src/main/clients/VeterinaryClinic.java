package main.clients;

import main.clients.animals.*;
import main.staff.Doctor;
import main.staff.Nurse;
import main.staff.Worker;

import java.util.ArrayList;

public class VeterinaryClinic {

    protected ArrayList<Worker> staff;
    protected ArrayList<Animal> patients;

    public VeterinaryClinic(){

    }



    // Методы получения всех бегающих, всех плавающих и всех летающих
    public void getSwimmers(ArrayList<Animal> patients) {

        int count = 0;

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) instanceof Swimable) {
                count++;
            }
        }
        System.out.println("Количество плавающих животных: " + count);
    }

    public void getFlyers(ArrayList<Animal> patients) {

        int count = 0;

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) instanceof Flyable) {
                count++;
            }
        }
        System.out.println("Количество летающих животных: " + count);
    }

    public void getRunners(ArrayList<Animal> patients) {

        int count = 0;

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) instanceof Goable) {
                count++;
            }
        }
        System.out.println("Количество бегающих животных: " + count);
    }

    // Методы для работы с персоналом



    protected void getStaffList() {
        ArrayList<Worker> staff = new ArrayList<>();
        this.staff = staff;
        Doctor doc = new Doctor("Иван Сергеевич", "Хирург");
        Doctor doc2 = new Doctor("Сергей Иванович", "Глав. врач");
        Nurse nurse1 = new Nurse("Алла Генадьевна");
        Nurse nurse2 = new Nurse("Виктория Константиновна");
        Nurse nurse3 = new Nurse("Валерия Анатольевна");

        staff.add(doc);
        staff.add(doc2);
        staff.add(nurse1);
        staff.add(nurse2);
        staff.add(nurse3);

        System.out.println(staff);

    }
    public void getStaffCount(){

        System.out.println("Всего работников: " + staff.size());
    }

}




