package Chapter2;

import java.util.Scanner;

public class ProblemNo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = scan.nextDouble();
        double acceleration = scan.nextDouble();
        double length = Math.pow(speed, 2) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is: " + length);
        scan.close();
    }
}
