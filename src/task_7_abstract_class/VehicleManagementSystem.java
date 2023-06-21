package task_7_abstract_class;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Car car = new Car("Cherry", "Tigo", 2021);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "B4", 2022);

        car.start();
        motorcycle.start();

        car.checkEngine(); 
        car.checkOil(); 

        motorcycle.checkBrake(); 
        motorcycle.checkLights(); 
    }
}
