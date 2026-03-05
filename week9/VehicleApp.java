package week9;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VehicleApp
{
    public static void main(String[] args) {

        Car car1 = new Car(101, "Toyota", 50000, 4);
        Bike bike1 = new Bike(201, "Yamaha", 15000, true);

        System.out.println("Car Details:");
        car1.displayCarInfo();

        System.out.println("\nBike Details:");
        bike1.displayBikeInfo();
    }
}