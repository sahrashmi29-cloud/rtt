package week9;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle 
{
    int numberOfDoors;

    Car(int vehicleId, String brand, double basePrice, int numberOfDoors) {
        super(vehicleId, brand, basePrice);   
        this.numberOfDoors = numberOfDoors;
    }

    void displayCarInfo() {
        super.displayVehicleInfo();   
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Tax: " + super.calculateTax());
    }
}