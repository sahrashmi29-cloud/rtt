package week9;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle {
    boolean hasGear;

    Bike(int vehicleId, String brand, double basePrice, boolean hasGear) {
        super(vehicleId, brand, basePrice);
        this.hasGear = hasGear;
    }

    void displayBikeInfo() {
        super.displayVehicleInfo();
        System.out.println("Has Gear: " + hasGear);
        System.out.println("Tax: " + super.calculateTax());
    }
}