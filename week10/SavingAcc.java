package week10;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAcc extends Account
{
     public SavingAcc(int accountNo, String holderName, double balance) 
    {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() 
    {
        super.calculateInterest();
        return balance * 0.05;
    }

    public double calculateInterest(double rate) 
    {
        return balance * rate;
    }
}