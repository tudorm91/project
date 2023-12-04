package task_11_Abstractisation;

public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle vroom vroom");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stops with back brakes");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Bicycle goes " + distance + " meters.");
    }
}
