package Chapter3;

import java.util.Scanner;

public class Exercise_3_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
//Calculations
        // Each line can be written in linear form:
        //        Line 1  ax + by = e
        //        Line i  cx + dy = f
        // Need to rearrange FIRST LINE to slope intercept form:
        //        a = y1 - y2
        //        b = -(x1 - x2)
        //        e = (y1 - y2) * x1 - (x1 -x2) * y1
        // Re-arrange SECOND LINE to slope intercept form
        //        c = y3 - y4
        //        d = -(x3 -x4)
        //        f = (y3 - y4) * x3 - (x3 - x4) * y3
        //And after that we can use Cramer's rule to find the intersect
        //LINE I
        double a = y1 -y2;
        double b = -(x1 -x2);
        double e = (y1 - y2) * x1 - (x1 -x2) * y1;
        //LINEII
        double c = y3 - y4;
        double d = -(x3 -x4);
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        //CRAMER's rule
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        double nosolution = (a * d) - (b * c);
        if( nosolution == 0 )
            System.out.println("The two lines are parallel.");
        else
            System.out.println("The intersecting point is at: (" + x +"," + y);
        input.close();
    }
}
