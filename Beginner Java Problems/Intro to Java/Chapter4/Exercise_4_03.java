package Chapter4;

import java.util.Scanner;

public class Exercise_4_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Ax = Math.toRadians(33.7489954);
        double Ay = Math.toRadians(-84.3879824);
        double Cx = Math.toRadians(35.2270869);
        double Cy = Math.toRadians(-80.8431267);
        double Sx = Math.toRadians(32.0835407);
        double Sy = Math.toRadians(-81.0998342);
        double Ox = Math.toRadians(28.5383355);
        double Oy = Math.toRadians(-81.3792365);
        double radius = 6371.01;
        double s1 = radius * Math.acos(Math.sin(Ax) * Math.sin(Cx) + Math.cos(Ax) * Math.cos(Cx) * Math.cos(Ay - Cy));
        double s2 = radius * Math.acos(Math.sin(Cx) * Math.sin(Sx) + Math.cos(Cx) * Math.cos(Sx) * Math.cos(Cy - Sy));
        double s3 = radius * Math.acos(Math.sin(Ax) * Math.sin(Sx) + Math.cos(Ax) * Math.cos(Sx) * Math.cos(Ay - Sy));
        double sone = (s1 + s2 + s3) / 2;
        double triangleArea1 = Math.sqrt(sone * (sone - s1) * (sone - s2) * (sone - s3));
        double s4 = s3;
        double s5 = radius * Math.acos(Math.sin(Sx) * Math.sin(Ox) + Math.cos(Sx) * Math.cos(Ox) * Math.cos(Sy - Oy));
        double s6 = radius * Math.acos(Math.sin(Ax) * Math.sin(Ox) + Math.cos(Ax) * Math.cos(Ox) * Math.cos(Ay - Oy));
        double stwo = (s4 + s5 + s6) / 2;
        double triangleArea2 = Math.sqrt(stwo * (stwo - s4) * (stwo - s5) * (stwo - s6));
        double area = triangleArea1 + triangleArea2;
        System.out.println("The area between Atlanta, Charlotte, Savannah and Orlando is " + area);
    }
}
