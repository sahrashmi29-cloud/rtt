package week7;


/**
 * Write a description of class ScenarioMainclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScenarioMainclass
{public static void main(String[] args)
    {
        BankAccount c1 = new BankAccount(1, "Sameer", 25000);
        BankAccount c2 = new BankAccount(2, "Pawan", 750000);

        c1.displayAccountInfo();
        c2.displayAccountInfo();

        c1.deposit(20000);
        c1.withdraw(1500);
        c1.displayAccountInfo();

        c2.withdraw(15000);
        c2.deposit(25000);
        c2.displayAccountInfo();
    }
}