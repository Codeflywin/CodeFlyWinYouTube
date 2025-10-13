package Chapter3;

import java.util.Scanner;

public class ProblemNo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int integer = input.nextInt();
        int d1 = integer / 100;
        int remainingDigits = integer % 100;
        int d2 = remainingDigits / 10;
        remainingDigits %= 10;
        int d3 = remainingDigits;
        if (d1 == d3)
            System.out.println( integer +" is a palindrome.");
        else
            System.out.println( integer +" is not a palindrome.");
        input.close();
    }
}
