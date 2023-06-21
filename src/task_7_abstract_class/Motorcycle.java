package task_7_abstract_class;
import task_7_abstract_class.Vehicle;

public class Motorcycle extends Vehicle implements Safety {
    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle");
    }

    @Override
    public void checkBrake() {
        System.out.println("Testing motorcycle brakes");
    }

    @Override
    public void checkLights() {
        System.out.println("Testing motorcycle lights");
    }
}
