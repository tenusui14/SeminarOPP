package main.clients;

import main.clients.animals.*;
import main.staff.Doctor;
import main.staff.Nurse;
import main.staff.Worker;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

    protected ArrayList<Worker> staff;
    protected ArrayList<Animal> patients;

    public VeterinaryClinic(ArrayList<Worker> staff, ArrayList<Animal> patients){
    this.patients = patients;
    this.staff = staff;
    }




    // Методы получения всех бегающих, всех плавающих и всех летающих
    public List<Animal> getSwimmers() {

        List<Animal> result = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) instanceof Swimable) {
                result.add(patients.get(i));
            }
        }
        System.out.println("Количество плавающих животных: " + result.size());
        return result;
    }

    public List<Animal> getFlyers() {

        List<Animal> result = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) instanceof Flyable) {
                result.add(patients.get(i));
            }
        }
        System.out.println("Количество летающих животных: " + result.size());
        return result;
    }

    public List<Animal> getRunners() {

        List<Animal> result = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) instanceof Goable) {
                result.add(patients.get(i));
            }
        }
        System.out.println("Количество бегающих животных: " + result.size());
        return result;
    }

    // Методы для работы с персоналом



    protected void getStaffList() {
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




