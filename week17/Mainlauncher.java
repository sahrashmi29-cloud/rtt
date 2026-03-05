package week17;

import javax.swing.*;

public class Mainlauncher
{
    public static void main()
    {
        Student s1 = new Student("101", "Ram", "Java");
        Student s2= new Student("102", "Shyam", "AI");
        SwingUtilities.invokeLater (() -> 
        {
              new IdCardWindow(s1).setVisible(true); 
              new IdCardWindow(s2).setVisible(true);

        });
    }
}