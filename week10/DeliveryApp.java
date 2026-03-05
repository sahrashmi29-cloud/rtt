package week10;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args) {

        BikeDelivery bike1 = new BikeDelivery(1, "Resham", 6000);
        CarDelivery car1 = new CarDelivery(1, "Surya", 4000);

        System.out.println("Bike Delivery Partner Details:");
        System.out.println(bike1);
        System.out.println("Payment: " + bike1.calculatePayment());
        System.out.println("Payment with extra orders: " +
                bike1.calculatePayment(5));

        System.out.println("\nCar Delivery Partner Details:");
        System.out.println(car1);
        System.out.println("Payment: " + car1.calculatePayment());
        System.out.println("Payment with extra orders: " +
                car1.calculatePayment(3));
}
}