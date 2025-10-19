package Chapter2;

import java.util.Scanner;

public class Exercise_2_11 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of years: ");
                long years = scanner.nextLong();
                long oneyear = ((312032486 + ((31536000 / 7) * years)) + ((31536000 / 45) * years) -((31536000 / 13) * years ));
                System.out.println(oneyear);
                scanner.close();
            }
        }


