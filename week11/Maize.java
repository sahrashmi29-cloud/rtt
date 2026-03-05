package week11;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize implements Transportable
{
    public double calculateTransportCost() {
        return 700;
    }

    public String getTransportMethod() {
        return "Jeep / Local Transport";
    }

    public void display() {
        System.out.println("Crop: Maize");
        System.out.println("Area: Hill Region");
        System.out.println("Water Requirement: Low");
    }
}