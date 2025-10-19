package Chapter2;

import java.util.Scanner;

public class Exercise_2_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        double interest = balance * (interestRate / 1200);
        System.out.println("Interest rate is: " + interest);
        scanner.close();
    }
}
