package week11;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice implements Transportable
{
    public double calculateTransportCost(){
        return 1500; 
    }

    public String getTransportMethod() {
        return "Truck";
    }

    public void display() {
        System.out.println("Crop: Rice");
        System.out.println("Season: Monsoon");
        System.out.println("Water Requirement: High");
    }
}