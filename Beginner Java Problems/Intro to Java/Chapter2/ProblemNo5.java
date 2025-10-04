package Chapter2;

import java.util.Scanner;
public class ProblemNo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = (input.nextDouble() / 100) * subtotal;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is " + gratuity + " and the total is " + total);
        input.close();
    }
}
