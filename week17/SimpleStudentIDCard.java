package week17;

import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleStudentIDCard extends JFrame
{ 
    public SimpleStudentIDCard() 
    {
        setTitle("Student ID Card Preview");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        String htmlText = "<html>" +
                         "<body style='text-align: center;'>" +
                         "<h2>STUDENT ID CARD</h2>" +
                         "<hr>" +
                         "<br>" +
                         "<b>Name:</b><br>" +
                         "Rashmi Sah<br>" +
                         "<br>" +
                         "<b>Module:</b><br>" +
                         "Computing<br>" +
                         "<br>" +
                         "<b>College:</b><br>" +
                         "Islington College<br>" +
                         "<hr>" +
                         "</body>" +
                         "</html>";

        JLabel idLabel = new JLabel(htmlText);
        idLabel.setHorizontalAlignment(JLabel.CENTER);
        idLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        add(idLabel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleStudentIDCard().setVisible(true);
        });
    }
}