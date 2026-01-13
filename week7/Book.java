package week7;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
   private String title;
   private String author;
   private int price; 
   
   public Book(String title, String author)
   {
       this.title = title;
       this.author = author;
   }
   
   public void displayDetails()
   {
       System.out.println("Title of the book is: " + this.title);
       System.out.println("Author of the book is: " + this.author);
   }
}