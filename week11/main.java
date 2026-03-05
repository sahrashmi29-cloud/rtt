package week11;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[2];
        
        shapes[0] = new Rectangle(10,15);
        shapes[1] = new Circle(7);
        
        for(Shape shape : shapes)
        {
            shape.displayShapeInfo();
            
            if(shape instanceof Drawable)
            {
                ((Drawable) shape).draw();
            }
        }
    }
}