package week17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoginWindow extends JFrame
{
    public LoginWindow() 
    {
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);  
        
        JTextField usernameField = new JTextField();
        usernameField.setBounds(100, 100, 150, 25);
        add(usernameField);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        loginButton.setBackground(Color.GREEN);
        add(loginButton);
    }
    
    public static void main(String[] args) 
    {
        LoginWindow window = new LoginWindow();
        window.setVisible(true);
    }
}