package week17;
import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentWindows extends JFrame
{
    StudentWindows()
    {
        setTitle("Student Profile");
        setSize(400,300);
    }
    
    public static void main()
    {
    SwingUtilities.invokeLater(() -> 
    {StudentWindows sw = new StudentWindows();
    sw.setDefaultCloseOperation(StudentWindows.EXIT_ON_CLOSE);
    JLabel l = new JLabel("Demo", JLabel.CENTER);
    sw.setVisible(true);});
    }
}