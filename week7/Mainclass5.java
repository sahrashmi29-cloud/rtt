package week7;


/**
 * Write a description of class Mainclass5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mainclass5
{public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Apple", 80000);
        Mobile mobile2 = new Mobile("Google", 270000);
        Mobile mobile3 = new Mobile("Samsung", 175000);

        System.out.println(mobile1.brand + " is affordable? " + mobile1.isAffordable());
        System.out.println(mobile2.brand + " is affordable? " + mobile2.isAffordable());
        System.out.println(mobile3.brand + " is affordable? " + mobile3.isAffordable());
    }
}