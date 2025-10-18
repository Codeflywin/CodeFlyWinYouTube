package Chapter3;

import java.util.Scanner;

public class Exercise_3_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a point (x,y) to check if the point is within a circle with a radius of 10: ");
        double x = scan.nextInt();
        double y = scan.nextInt();
        double distance = Math.pow(((Math.pow( (0 - x), 2) + Math.pow(( 0 - y), 2))), 0.5);
        if (distance <= 10)
            System.out.println("Point (" + x +"," + y + ") is in the circle.");
        else
            System.out.println("Point (" + x +"," + y + ") is not in the circle.");
        scan.close();
    }

}
