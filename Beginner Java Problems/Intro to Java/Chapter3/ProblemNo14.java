package Chapter3;

import java.util.Scanner;
public class ProblemNo14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for heads, or 1 for tails to guess the flip of a coin: ");
        int number = input.nextInt();
        if (number != 0 || number != 1)
            System.out.println("I'm flipping a coin, but you did not enter 0 or 1, so you will have to re-enter.");
        //Math.random() will print a double between 0 and 1 (1 is not inclusive, in order for it to be 1, it needs to be
        // multiplied by 2 so the int truncates it and doesn't round it.
        int flip = (int) (Math.random() * 2);
        if (flip == 0)
            System .out.println("The flipped coin is heads.");
        else
            System .out.println("The flipped coin is tails.");

        if (number == flip)
            System.out.println("You guessed the flipped coin.");
        else
            System.out.println("You guessed wrong.");

        input.close();
    }
}


