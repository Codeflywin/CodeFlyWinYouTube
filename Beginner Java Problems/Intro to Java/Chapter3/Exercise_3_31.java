package Chapter3;

import java.util.Scanner;

public class Exercise_3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vide versa: ");
        double currency = input.nextDouble();
        if (currency == 0)
            System.out.println("Enter the dollar amount: ");
        else
            System.out.println("Enter the RMB amount: ");
        double amount = input.nextDouble();
        double convertedAmount = currency == 0 ?  amount * exchangeRate : amount / exchangeRate;
        if (currency == 0)
            System.out.println( "$" + amount + " dollars is " + convertedAmount + " yuan");
        else
            System.out.println( amount + " yuan is $" + convertedAmount);
        input.close();
    }
}
