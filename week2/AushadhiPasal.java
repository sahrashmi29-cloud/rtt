package week2;


/**
 * Write a description of class AushadhiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AushadhiPasal
{public static void main(String[] args) {

        // Medicine information (you can modify as needed)
        String[] medicineNames = {"Paracetamol", "Cetirizine", "Amoxicillin", "ORS", "Metformin"};
        double[] pricePerTablet = {2.0, 3.5, 10.0, 15.0, 8.0};
        int[] stock = {120, 80, 40, 60, 30};
        boolean[] prescriptionRequired = {false, false, true, false, true};

        System.out.println("\n===============================");
        System.out.println("     AUSHADHI PASAL REPORT");
        System.out.println("===============================\n");

        System.out.printf("%-15s %-10s %-10s %-15s\n",
                "Medicine", "Price(NPR)", "Stock", "Prescription?");
        System.out.println("-----------------------------------------------------");

        // Display inventory
        for (int i = 0; i < medicineNames.length; i++) {
            System.out.printf("%-15s %-10.2f %-10d %-15s\n",
                    medicineNames[i],
                    pricePerTablet[i],
                    stock[i],
                    (prescriptionRequired[i] ? "Yes" : "No"));
        }

        System.out.println("\n-----------------------------------------------------");
        System.out.println("Report generated successfully.");
        System.out.println("Thank you for using Aushadhi Pasal System!");
        System.out.println("-----------------------------------------------------\n");
    }
}