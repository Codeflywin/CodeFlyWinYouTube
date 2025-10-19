package Chapter2;

import java.util.Scanner;

public class Exercise_2_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles :");
        double miles = scan.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println( miles +" miles is " + kilometers + " kilometers.");
        scan.close();
    }
}
