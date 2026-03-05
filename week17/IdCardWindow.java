package week17;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IdCardWindow extends JFrame 
{
    IdCardWindow(Student std){
        JLabel l= new JLabel(std.getFormattedHTMLText(), JLabel.CENTER);
        add(l);
        setSize(450, 300);
    }

}