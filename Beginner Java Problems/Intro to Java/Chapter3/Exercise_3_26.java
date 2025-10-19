package Chapter3;

import java.util.Scanner;

public class Exercise_3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("Is " + number + " divisible by 4 and 5? ");
        if ( number % 4 == 0 && number % 5 == 0)
            System.out.println(" true");
        else
            System.out.println(" false");

        System.out.print(" Is " + number + " divisible by 4 or 5? ");
        if (number % 4 == 0 || number % 5 == 0)
            System.out.println(" true");
        else
            System.out.println(" false");

        System.out.print(" Is " + number + " divisible by 4 or 5, but not both? ");
        if (number % 4 == 0 ^ number % 5 == 0)
            System.out.println(" true");
        else
            System.out.println(" false");
        input.close();
    }
}
