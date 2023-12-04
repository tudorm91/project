package task_11_Abstractisation;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping...");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Car is driving for " + distance + " miles.");
    }
}
