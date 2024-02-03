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

    public VeterinaryClinic(ArrayList<Worker> staff, ArrayList<Animal> patients) {
        this.patients = patients;
        this.staff = staff;
    }

    public VeterinaryClinic() {
        patients = new ArrayList<>();
        staff = new ArrayList<>();
    }

    public void setPatients(ArrayList<Animal> patients) {
        this.patients = patients;
    }

    public void setStaff(ArrayList<Worker> staff) {
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

    // Методы для работы с персоналом и животными:

    public ArrayList<Worker> addWorker(Worker worker) {
        staff.add(worker);
        return staff;
    }

    public ArrayList<Animal> addPatient(Animal animal) {
        patients.add(animal);
        return patients;
    }

    public ArrayList<Worker> delWorker(Worker worker) {
        if (staff.contains(worker)) {
            staff.remove(worker);
            return staff;
        } else {
            return staff;
        }
    }

    public ArrayList<Animal> delPatient(Animal animal) {
        if (patients.contains(animal)) {
            patients.remove(animal);
            return patients;
        } else {
            return patients;
        }
    }


}




