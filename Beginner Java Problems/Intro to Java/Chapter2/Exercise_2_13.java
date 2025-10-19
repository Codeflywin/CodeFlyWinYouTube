package Chapter2;

import java.util.Scanner;

public class Exercise_2_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the monthly savings amount: ");
        double savings = scan.nextInt();
        double monthone = savings * (1 + 0.003125);
        double monthtwo = (savings + monthone) * (1 + 0.003125);
        double monththree = (savings + monthtwo) * (1 + 0.003125);
        double monthfour = (savings + monththree) * (1 + 0.003125);
        double monthfive = (savings + monthfour) * (1 + 0.003125);
        double monthsix = (savings + monthfive) * (1 + 0.003125);
        System.out.println("After the first month, the account value is: " + monthone );
        System.out.println("After the second month, the account value is: " + monthtwo);
        System.out.println("After the third month, the account value is: " + monththree);
        System.out.println("After the sixth month, the account value is: " + monthsix);
scan.close();
    }
}
