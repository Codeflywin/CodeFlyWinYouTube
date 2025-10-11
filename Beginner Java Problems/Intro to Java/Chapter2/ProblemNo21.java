package Chapter2;

import java.util.Scanner;

public class ProblemNo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.println("Enter interest rate in percentage: ");
        double interestRate = scanner.nextDouble();
        double monthlyInterest = interestRate / 1200;
        System.out.println("Enter number of years: ");
        double years = scanner.nextDouble();
        double futureValue = investmentAmount * Math.pow((1 + monthlyInterest), (years * 12));
        System.out.println("The future value is " + futureValue);
        scanner.close();
    }
}
