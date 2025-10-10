package Chapter2;

import java.util.Scanner;

public class ProblemNo10 {
    public static void main(String[] args) {
        System.out.print("Enter the amount of water in kilograms: ");
        Scanner scan = new Scanner(System.in);
        double water = scan.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = scan.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemperature = scan.nextDouble();
        double energy = water * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + energy);
        scan.close();
    }
}
