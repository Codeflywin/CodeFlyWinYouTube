package Chapter2;

import java.util.Scanner;

public class ProblemNo19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coordinates of three points separated by spaces: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double s1 = Math.pow( Math.pow((x2 - x1),2)  + Math.pow((y2 - y1), 2), 0.5);
        double s2 = Math.pow( Math.pow((x3 - x2),2)  + Math.pow((y3 - y2), 2), 0.5);
        double s3 = Math.pow( Math.pow((x1 - x3),2)  + Math.pow((y1 - y3), 2), 0.5);
        double s = (s1 + s2 + s3)/2;
        double triangleArea = Math.pow((s * ( s - s1)) * ( s - s2) * ( s - s3), 0.5);
        System.out.println("The area of the triangle is: " + triangleArea);
        scanner.close();
    }
}
