package week7;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{String brand;
    int price;

    public Mobile(String brand, int price)
    {
        this.brand = brand;
        this.price = price;
    }

    public boolean isAffordable()
    {
        return price < 20000;
    }
}