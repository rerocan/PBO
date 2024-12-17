package Praktikum.pert9.vihicle;

class Vehicle{
    String brand;


    public Vehicle (String brand){
        this.brand = brand;
    }

    public void displayinfo(){
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle{
    int doors;

    public Car(String brand, int doors){
        super(brand);
        this.doors = doors;
    }

    public void displayinfo(String type){
        super.displayinfo();
        System.out.println("Type    : " + type +",Doors  :" + doors );
    }
}

public class VehicleTester{
    public static void main (String [] args){
        Car car= new Car ("Toyota", 4);
        car.displayinfo("Sedan");
    }
}