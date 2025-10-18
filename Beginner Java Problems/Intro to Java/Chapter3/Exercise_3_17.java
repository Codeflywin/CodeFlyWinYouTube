package Chapter3;

import java.util.Scanner;

public class Exercise_3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int hand = input.nextInt();
        int computerhand = (int) (Math.random() * 3);

        if  (hand == 0 && computerhand == 0)
            System.out.println("The computer is scissors. You are scissors. It is a draw.");
        else if (hand == 1 && computerhand == 1)
            System.out.println("The computer is rock. You are rock. It is a draw.");
        else if (hand == 2 && computerhand == 2)
            System.out.println("The computer is paper. You are paper. It is a draw.");
        else if (hand == 0 && computerhand == 1)
            System.out.println("The computer is rock. You are scissors. You lose.");
        else if (hand == 0 && computerhand == 2)
            System.out.println("The computer is paper. You are scissors. You win.");
        else if (hand == 1 && computerhand == 0)
            System.out.println("The computer is scissors. You are rock. You win.");
        else if (hand == 1 && computerhand == 2)
            System.out.println("The computer is paper. You are rock. You lose.");
        else if (hand == 2 && computerhand == 0)
            System.out.println("The computer is scissors. You are paper. You lose.");
        else if (hand == 2 && computerhand == 1)
            System.out.println("The computer is scissors. You are rock. You win.");
            input.close();
        }
    }

