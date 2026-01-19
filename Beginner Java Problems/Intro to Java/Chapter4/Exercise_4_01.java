package Chapter4;

import java.util.Scanner;

public class Exercise_4_01 {

    public static void main(String[] args) {
        System.out.println("Enter the length from the center to a vertex: ");
        Scanner input = new Scanner (System.in);
        double r = input.nextDouble();
        double s = ( (2 * r) * Math.sin(Math.PI / 5));
        double area = ( 5 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %4.2f ", area);
    }
}
