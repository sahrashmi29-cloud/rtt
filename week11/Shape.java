package week11;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public abstract class Shape
{
 public abstract double calculateArea();
 public abstract double calculatePerimeter();
 public void displayShapeInfo()
    {
    System.out.println("Area" + calculateArea());
    System.out.println("Perimeter" + calculatePerimeter());
    }
}