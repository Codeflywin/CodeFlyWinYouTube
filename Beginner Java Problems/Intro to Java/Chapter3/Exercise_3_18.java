package Chapter3;

import java.util.Scanner;

public class Exercise_3_18 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of a package in order to receive shipping price: ");
        double weight = scanner.nextDouble();
        //In case of shipping price change, I created variables for every weight category
        double shippingCost1 = 2.5;
        double shippingCost2 = 4.5;
        double shippingCost3 = 7.5;
        double shippingCost4 = 10.5;
        if (weight == 0 || weight < 0)
            System.out.println("Please enter a valid weight.");
        else if (weight == 0 && weight <= 2 )
                System.out.println("The cost to ship the package is: " + weight * shippingCost1);
        else if (weight > 2 && weight <= 4 )
                System.out.println("The shipping cost is: " + weight * shippingCost2);
        else if (weight > 4 && weight <= 10 )
            System.out.println("The shipping cost is: " + weight * shippingCost3);
        else if (weight > 10 && weight <= 20 )
            System.out.println("The shipping cost is: " + weight * shippingCost4);
        else
            System.out.println("The package cannot be shipped.");
        scanner.close();
    }
}
