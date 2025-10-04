package Chapter2;

import java.util.Scanner;
public class ProblemNo6 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int first = i / 10 / 10;
        int second = i / 10 % 10;
        int third = i % 10;
        System.out.println("The multiplication of all digits in " + i + " is " + first * second * third);
        scan.close();
    }
}
