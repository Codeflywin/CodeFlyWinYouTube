package Chapter2;

import java.util.Scanner;

public class ProblemNo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double mpg = scanner.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();
        double tripCost = (distance / mpg) *  pricePerGallon;
        System.out.println("The cost of driving is: " + tripCost);
        scanner.close();
    }
}
