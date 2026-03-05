package week16;
import java.util.Scanner;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String trimmed = input.trim();
        System.out.println("After trim(): " + trimmed);

        String firstTen;
        if (trimmed.length() >= 10) {
            firstTen = trimmed.substring(0, 10);} else
            {firstTen = trimmed; }
        System.out.println("First 10 characters: " + firstTen);

        String[] words = trimmed.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {System.out.println(word);}

        sc.close();
    }
}