package Chapter3;

import java.util.Scanner;

public class ProblemNo1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a, b, c: ");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double discriminant = Math.pow( b, 2 ) - (4 * a * c);
    double root1 = ( ((-b) + Math.pow((Math.pow(b, 2)) - (4 * a * c), 0.5)) / (2 * a));
    double root2 = ( ((-b) - Math.pow((Math.pow(b, 2)) - (4 * a * c), 0.5)) / (2 * a));
    if( discriminant > 0 )
        System.out.println("The equation has two roots: " + root1 + " and " + root2);
        else if (discriminant == 0)
        System.out.println("The equation has one root: " + root1);
        else
            System.out.println("The equation has no real roots.");
            }
         }



