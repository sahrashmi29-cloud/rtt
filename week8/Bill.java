package week8;


/**
 * Write a description of class Bill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bill
{public static void main(String[] args) 
    {
        ElectricityBill b1 = new ElectricityBill("Enel", 230);

        b1.displayBill();

        System.out.println();

        b1.setUnitsConsumed(90);
        System.out.println("Updated Bill:");
        b1.displayBill();
    }
}