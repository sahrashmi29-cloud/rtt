package week11;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FarmManagement {
    public static void main(String[] args) 
    {

        Rice r = new Rice();
        Wheat w = new Wheat();
        Maize m = new Maize();

        r.display();
        System.out.println("Transport Method: " + r.getTransportMethod());
        System.out.println("Transport Cost: " + r.calculateTransportCost());

        System.out.println();

        w.display();
        System.out.println("Transport Method: " + w.getTransportMethod());
        System.out.println("Transport Cost: " + w.calculateTransportCost());

        System.out.println();

        m.display();
        System.out.println("Transport Method: " + m.getTransportMethod());
        System.out.println("Transport Cost: " + m.calculateTransportCost());
    }
}