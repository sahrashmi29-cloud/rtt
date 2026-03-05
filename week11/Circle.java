package week11;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape implements Drawable
{
    double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter()
    {
        return 2*Math.PI * radius;
    }
    
    @Override
    public void draw()
    {
        System.out.println("Drawing a circle");
    }
}