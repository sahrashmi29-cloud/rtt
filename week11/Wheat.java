package week11;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheat implements Transportable
{
    public double calculateTransportCost() {
        return 1000;
    }

    public String getTransportMethod() {
        return "Tractor";
    }

    public void display() {
        System.out.println("Crop: Wheat");
        System.out.println("Season: Winter");
        System.out.println("Water Requirement: Moderate");
    }
}