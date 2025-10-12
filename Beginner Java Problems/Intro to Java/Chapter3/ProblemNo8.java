package Chapter3;

import java.util.Scanner;

public class ProblemNo8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        if (numberOne < numberTwo) {
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }
        if (numberTwo > numberThree) {
            int temp = numberTwo;
            numberTwo = numberThree;
            numberThree = temp;
        }
        if (numberOne > numberTwo) {
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }
        System.out.println("The sorted numbers are: " + numberOne + " " + numberTwo + " " + numberThree);
        input.close();
    }
}
