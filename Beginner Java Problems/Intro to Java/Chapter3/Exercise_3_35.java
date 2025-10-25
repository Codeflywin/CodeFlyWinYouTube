package Chapter3;

import java.util.Scanner;

public class Exercise_3_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int result = number % 2;
        if(result == 0)
            System.out.println( number + " is an even number");
        else
            System.out.println( number + " is an odd number");
        input.close();
    }
}
