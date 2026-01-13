package week7;


/**
 * Write a description of class Mainclass1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mainclass1
{public static void main(String[] args)
    {
        Book b1 = new Book("title1","author1");
        Book b2 = new Book("title2","author2");
        
        b1.displayDetails();
        b2.displayDetails();
    }
}