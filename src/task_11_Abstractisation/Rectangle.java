package task_11_Abstractisation;

public class Rectangle extends Shape {
    private final double LENGTH;
    private final double WIDTH;

    public Rectangle(double length, double width) {
        this.LENGTH = length;
        this.WIDTH = width;
    }

    @Override
    public double calculateArea() {
        return LENGTH * WIDTH;
    }
}
