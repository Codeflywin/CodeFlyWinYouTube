package Chapter4;

import java.util.Scanner;

public class Exercise_4_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Ax = Math.toRadians(33.7489954);
        double Ay = Math.toRadians(84.3879824);
        double Cx = Math.toRadians(35.2270869);
        double Cy = Math.toRadians(-80.8431267);
        double Sx = Math.toRadians(32.0835407);
        double Sy = Math.toRadians(-81.0998342);
        double Ox = Math.toRadians(28.5383355);
        double Oy = Math.toRadians(81.3792365);
        double radius = 6371.01;
        double AC =  radius * Math.acos(Math.sin(Ax) * Math.sin(Cx) + Math.cos(Ax) * Math.cos(Cx) * Math.cos(Ay - Cy));
        double CS =  radius * Math.acos(Math.sin(Cx) * Math.sin(Sx) + Math.cos(Cx) * Math.cos(Sx) * Math.cos(Cy - Sy));
        double SO =  radius * Math.acos(Math.sin(Sx) * Math.sin(Ox) + Math.cos(Sx) * Math.cos(Ox) * Math.cos(Sy - Oy));
        double OA =  radius * Math.acos(Math.sin(Ox) * Math.sin(Ax) + Math.cos(Ox) * Math.cos(Ax) * Math.cos(Oy - Ay));
        double area = AC + CS + SO + OA;
        System.out.println("The area between Atlanta, Charlotte, Savannah and Orlando is " + area);
    }
}
