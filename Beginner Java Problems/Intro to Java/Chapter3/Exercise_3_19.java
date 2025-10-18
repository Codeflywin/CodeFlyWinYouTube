package Chapter3;

import java.util.Scanner;

public class Exercise_3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three edges of a triangle in order to calculate the perimeter:");
        System.out.println("Edge a: ");
        double a = input.nextDouble();
        System.out.println("Edge b: ");
        double b = input.nextDouble();
        System.out.println("Edge c: ");
        double c = input.nextDouble();
        if ( a + b > c || a + c > b || b + c > a)
            System.out.println("The perimeter equals: " + (a + b + c) );
        else
            System.out.println("The input is invalid.");

    }
}
