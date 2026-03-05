package week10;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person
{
    private String shift;
    private double extraAllowance;

    public Nurse(int Id, String Name, String shift, double extraAllowance)
    {
        super(Id, Name);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }

    @Override
    public double calculateSalary()
    {
        double base = super.calculateSalary();
        return base + extraAllowance;
    }

    @Override
    public String toString()
    {
        return super.toString() +
               ", Shift: " + this.shift +
               ", Extra Allowance: " + this.extraAllowance;
    }
}