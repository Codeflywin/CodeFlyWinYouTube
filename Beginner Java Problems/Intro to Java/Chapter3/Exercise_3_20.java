package Chapter3;

import java.util.Scanner;

public class Exercise_3_20 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
            double tempF = scan.nextDouble();
            if (tempF < -58 || tempF > 41)
                System.out.println("Invalid input");
            else
                System.out.println("Enter the wind speed (>= 2) in miles per hour: ");
            double windSpdMil = scan.nextDouble();
            double windChill = (35.74 + (0.6215 * tempF)) - (35.75 * (Math.pow (windSpdMil, 0.16))) + (0.4275* tempF * (Math.pow(windSpdMil, 0.16)));
            if (windSpdMil < 2 )
                System.out.println("Invalid input");
            else
                System.out.println("The wind chill index is: " + windChill);
            scan.close();
        }
    }


