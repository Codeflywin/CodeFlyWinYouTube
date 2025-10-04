package Chapter2;

import java.util.Scanner;
public class ProblemNo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in square meters: ");
        double meters = new Scanner(System.in).nextDouble();
        double pings = meters * 0.3025;
        System.out.println(meters + " square meters is " + pings + " pings");
        scan.close();
    }
}
