package week10;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Order
{
    public PremiumOrder(int orderId, String customerName, double amount) 
    {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() 
    {
        super.calculateFinalAmount();
        return amount - 100;
    }

    public double calculateFinalAmount(double discountAmount) 
    {
        return amount - discountAmount;
    }
}