package week16;
import java.util.Scanner;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        
        System.out.println("Enter second string");
        String s2 = sc.nextLine();
        String combinedString = s1.concat(s2);
        System.out.println("Enter third string");
        String s3 = sc.nextLine();
        
        System.out.println("Is combined String and Third String? "+ combinedString.equals(s3));
        
        
        
        
        
        
    }
}