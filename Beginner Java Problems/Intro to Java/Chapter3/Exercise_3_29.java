package Chapter3;

import java.util.Scanner;

public class Exercise_3_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle r1’s center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.println("Enter circle r1’s center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        double distance = Math.pow(((Math.pow( (x2 - x1), 2) + Math.pow(( y2 - y1), 2))), 0.5);
        double radiusdistance = r1 >= r2 ? r1 - r2 : r2 - r1;
        double radiusdistance2 = r1 + r2;
        if ( distance <= radiusdistance)
            System.out.println("circle2 is inside circle1");
        else if ( distance <= radiusdistance2 )
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
    }
}
