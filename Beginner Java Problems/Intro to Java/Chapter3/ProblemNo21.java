package Chapter3;

import java.util.Scanner;
public class ProblemNo21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: (e.g., 2012): ");
        int year = scan.nextInt();
        System.out.println("Enter the month 1-12: ");
        int m = scan.nextInt();

        if (m == 1) {
            m = 13;
            year--;
        }
             else if (m == 2) {
                 m = 14;
                 year--;
             }

                System.out.println("Enter the day of the month: 1-31: ");
                int q = scan.nextInt();
                int century = year % 100;
                int j = year / 100;
                int h = (q + ((26 * (m + 1)) / 10) + century + (century / 4) + (j / 4) + (5 * j));
                System.out.println("The day of the week is: ");

                //According to Zeller's formula the first day of the week is Saturday, which means 0 is Saturday!!
                switch (h % 7) {
                    case 0:
                        System.out.println("Saturday");
                        break;
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                }
                scan.close();
            }
        }


