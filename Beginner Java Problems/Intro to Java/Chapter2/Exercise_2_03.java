package Chapter2;

import java.util.Scanner;

public class Exercise_2_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for meter: ");
        double meter = new Scanner(System.in).nextDouble();
        double feet = meter * 3.2786;
        System.out.println(meter + " meters is " + feet + " feet.");
        scan.close();
    }
}
