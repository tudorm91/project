package task_7_abstract_class;

 abstract class Vehicle {
  protected String brand;
  protected String model;
  protected int year;

  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  public abstract void start();
}
