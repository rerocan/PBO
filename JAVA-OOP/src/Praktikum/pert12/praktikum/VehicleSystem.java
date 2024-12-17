package Praktikum.pert12.praktikum;

// Interface to define vehicle operations
interface VehicleOperations {
    void startEngine();
    void stopEngine();
    void displayInfo();
}

// Abstract class to define basic structure of a vehicle
abstract class Vehicle implements VehicleOperations {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Car class implementing abstract class
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the car engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the car engine...");
    }

    @Override
    public void displayInfo() {
        showDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Motorcycle class implementing abstract class
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the motorcycle engine...");
    }

    @Override
    public void displayInfo() {
        showDetails();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to test the system
public class VehicleSystem {
    public static void main(String[] args) {
        // Create instances of vehicles
        Vehicle car = new Car("Mazda", "Rx-7 fd3s", 2);
        Vehicle motorcycle = new Motorcycle("Kawasaki", "H2R", false);

        // Show details and operations
        System.out.println("Car Details:");
        car.displayInfo();
        car.startEngine();
        car.stopEngine();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayInfo();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
