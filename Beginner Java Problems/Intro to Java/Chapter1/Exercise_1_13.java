package Chapter1;

import java.util.Scanner;

public class Exercise_1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        double x = (( e * d ) - ( b * f )) / (( a * d) - ( b * c ));
        double y = (( a * f ) - ( e * c)) / (( a * d ) - ( b * c ));
        System.out.println("The value for x is " + x + " ,the value for y is:" + y);
        scanner.close();
    }
}
