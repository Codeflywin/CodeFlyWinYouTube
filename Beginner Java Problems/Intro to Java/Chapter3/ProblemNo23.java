package Chapter3;

import java.util.Scanner;

public class ProblemNo23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a point (x,y) to check if the point is within a square centered at (1,1) with a width of 10 and height of 5: ");
        double x = scan.nextInt();
        double y = scan.nextInt();
        double Hdistance = Math.abs(( 1 - x ));
        double Ydistance = Math.abs(( 1 - y ));
        System.out.println(Hdistance + "  " + Ydistance);
        if (Hdistance <= 5 && Ydistance <= 2.5 )
            System.out.println("Point (" + x +"," + y + ") is in the rectangle.");
        else
            System.out.println("Point (" + x +"," + y + ") is not in the circle.");
        scan.close();
    }
}
