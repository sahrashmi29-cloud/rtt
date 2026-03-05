package week16;


/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main (String[] args)
    {
        String phone = "97393939-0" ;
        if (isValidPhone (phone)) {
            System. out. println("Valid") ;
        }else {
            System. out. println("In Valid") ;
        }
    }
      
    public static boolean isValidPhone (String phone) {
        return phone.matches ("(98|97) \\d{8}") ;
    }
}    