package Chapter2;

import java.util.Scanner;

public class Exercise_2_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scan.nextDouble();
        double weightKilograms = weightPounds * 0.45359237;
        System.out.print("Enter height in inches: ");
        double heightInches = scan.nextDouble();
        double heightMeters =  heightInches * 0.0254;
        double BMI = weightKilograms / Math.pow(heightMeters, 2);
        System.out.println("BMI is " + BMI);
        scan.close();
    }
}
