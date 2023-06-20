package task_7_abstract_class;

import task_7_abstract_class.Maintenance;
import task_7_abstract_class.Vehicle;

public class Car extends Vehicle implements Maintenance {
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting car");
    }

    @Override
    public void checkEngine() {
        System.out.println("Checking car engine");
    }

    @Override
    public void checkOil() {
        System.out.println("Checking the car's oil");
    }
}
