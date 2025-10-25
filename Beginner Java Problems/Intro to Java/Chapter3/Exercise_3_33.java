package Chapter3;

import java.util.Scanner;

public class Exercise_3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight = input.nextDouble();
        double price = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double priceperlbs1 = price / weight;
        double priceperlbs2 = price2 / weight2;
        if (priceperlbs1 > priceperlbs2)
            System.out.println("Package 2 has a better price.");
        else if (priceperlbs1 < priceperlbs2)
            System.out.println("Package 1 has a better price.");
        else
            System.out.println("Two packages have the same price.");
        input.close();
    }
}
