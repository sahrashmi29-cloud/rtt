package week10;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAcc extends Account
{
     public CurrentAcc(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        super.calculateInterest();
        return balance * 0.02; 
    }

    public double calculateInterest(double rate) {
        return balance * rate;
    }
}