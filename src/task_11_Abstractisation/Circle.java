package task_11_Abstractisation;

public class Circle extends Shape {
    private final double RADIUS;

    public Circle(double radius) {
        this.RADIUS = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(RADIUS,2);
    }
}
