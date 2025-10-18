package Chapter3;

import java.util.Scanner;

public class Exercise_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        double nosolution = (a * d) - (b * c);
        if( nosolution != 0 )
            System.out.println("x is " + x + " and y is " + y);
         else
            System.out.println("The equation has no solution.");
            scanner.close();
        }
    }
