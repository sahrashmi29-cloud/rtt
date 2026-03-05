package week10;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] args)
    {
        Doctor d1 = new Doctor(1,"Dr. Aarav","Opthalmologist",1500);

        Nurse n1 = new Nurse(1,"Anya","Day",8000);

        Nurse n2 = new Nurse(2,"Shreeya","Night",4000);

        System.out.println("DOCTOR DETAILS");
        System.out.println(d1);
        System.out.println("Doctor Salary: " + d1.calculateSalary());
        System.out.println("Doctor Salary (with emergencies): " +
                d1.calculateSalary(4));

        System.out.println("\nNURSE DETAILS");
        System.out.println(n1);
        System.out.println("Nurse Salary: " + n1.calculateSalary());

        System.out.println("\nNURSE DETAILS");
        System.out.println(n2);
        System.out.println("Nurse Salary: " + n2.calculateSalary());
    }
}