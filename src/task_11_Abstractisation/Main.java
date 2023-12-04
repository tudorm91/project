package task_11_Abstractisation;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(8.7, 20);
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println();
        System.out.println("Vehicle fun starts here\n"  );
        car.start();
        car.drive(120);
        car.stop();
        bicycle.start();
        bicycle.drive(10);
        bicycle.stop();
    }
}
