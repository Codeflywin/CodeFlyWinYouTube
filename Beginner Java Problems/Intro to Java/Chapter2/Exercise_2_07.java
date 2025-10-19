package Chapter2;

import java.util.Scanner;

public class Exercise_2_07 {
    public static void main(String[] args) {
        System.out.println("Enter a number of minutes: ");
        Scanner scan = new Scanner(System.in);
        long minutes = (long) scan.nextFloat();
        long days = minutes / 60 / 24;
        long years = days / 365;
        long remainingdays = days % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingdays + " days");
        scan.close();
    }
}
