package Chapter2;
import java.util.Scanner;

public class Exercise_2_02_a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of the sides and height of the Equilateral triangle: ");
        double length = scan.nextDouble();
        double height = scan.nextDouble();
        double area = (Math.pow(3, 0.5) / 4)  * Math.pow(length, 2);
        double volume = area * height;
        System.out.printf("The area is: %.2f%n", area);
        System.out.printf("The volume of the Triangular prism is: %.2f%n", volume);
    }
}