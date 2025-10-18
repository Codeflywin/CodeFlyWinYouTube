package Chapter3;

import java.util.Scanner;

public class Exercise_3_6 {
    public static void main(String[] args) {

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightLBS = input.nextInt();
        System.out.print("Enter feet: ");
        double feet = input.nextInt();
        System.out.print("Enter inches: ");
        double inches = input.nextInt();
        double totalinches = (feet * 12) + inches;
        double weightinKilograms = weightLBS * KILOGRAMS_PER_POUND;
        double heightinMeters = totalinches * METERS_PER_INCH;
        double bmi = weightinKilograms / (heightinMeters * heightinMeters);
        System.out.println("BMI is " + bmi);
    if (bmi < 18.5)
        System.out.println("Underweight");
    else if (bmi < 25)
        System.out.println("Normal");
    else if (bmi < 30)
        System.out.println("Overweight");
    else
        System.out.println("Obese");
    }
}
