package Chapter2;

import java.util.Scanner;

public class ProblemNo16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double length = scan.nextDouble();
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(length, 2);
        System.out.println("The area of the hexagon: " + area);
        scan.close();
    }
}
