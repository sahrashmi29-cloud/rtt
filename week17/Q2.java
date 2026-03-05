package week17;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Color;


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
        
        JFrame frame = new JFrame("College Event Announcement");

        frame.setSize(400, 300);

        frame.getContentPane().setBackground(Color.pink);

        frame.setLocationRelativeTo(null);

        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to Orientation Day",SwingConstants.CENTER);

        frame.add(label);

        frame.setVisible(true);
    }
}