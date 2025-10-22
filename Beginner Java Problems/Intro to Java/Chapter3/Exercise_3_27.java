package Chapter3;

import java.util.Scanner;

//Assuming:
// A = (0,0)
// B = (200,0) (x1, y1)
// C = (0,100) (x2, y2)
//Need to find the slope of the line BC
//m = (y2 -y1) / (x2 -x2) = (100 - 0) / (0 -200)= - (1/2)
//Point slope form
// B (200,0)
// y - 0 = -(1/2) * (x-200)
// y = -(1/2)x +100
//Intercept form, get rid of fraction
// 2y = -x + 200
// 2y + x = 200
// (x / 200) + (2y / 200) = 1
//(x / 200) + (y / 100) = 1
//Now all we need to do is plug the entered point by the user as x and y, and if it is less or equal to 1 it is going to satisfy the line BC, if more than 1 it will be outside

public class Exercise_3_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double xIntercept = (x / 200) + ( y / 100);
        System.out.println(xIntercept);
        //We know that the x value cannot be bigger than 200 and smaller than 0
        if (x < 0 || x > 200 || y < 0 || y > 100 || xIntercept >= 1 )
            System.out.println("Point (" + x +"," + y + ") is not in the triangle.");
        else
            System.out.println("Point (" + x +"," + y + ") is in the triangle.");
scanner.close();
    }
}
