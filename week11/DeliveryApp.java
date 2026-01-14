package week11;



public class DeliveryApp
{
    public static void main (String[] args)
    
    {

        // int orderid, double distance, String pickUp, String dropoff
        Delivery d1= new CarDelivery(101, 10, "Budhanilkantha", "Lagankhel");
        System.out.println(d1.calculatecharge()); // dynamic method dispatch
        
        Notifications d3= new CarDelivery(101, 10, "Buddhanilkantha", "Lagankhel");
        d3.notify("Your orde has been placed");
        
        Delivery d2= new BikeDelivery(102, 12, "Naxal", "Patan");
        System.out.println(d2.calculatecharge());
        
    }
}