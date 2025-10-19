package Chapter3;

import java.util.Scanner;

public class Exercise_3_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int days = input.nextInt();
        int futureDay = (today + days) % 7;
        if (today == 0 )
        System.out.print("Today is Sunday and the future day is");
        else if ( today == 1 )
            System.out.print("Today is Monday and the future day is");
        else if ( today == 2 )
            System.out.print("Today is Tuesday and the future day is");
        else if ( today == 3 )
            System.out.print("Today is Wednesday and the future day is");
        else if ( today == 4 )
            System.out.print("Today is Thursday and the future day is");
        else if ( today == 5 )
            System.out.print("Today is Friday and the future day is");
        else if ( today == 6 )
            System.out.print("Today is Saturday and the future day is");
        if (futureDay == 0)
            System.out.println(" Sunday");
        else if ( futureDay == 1)
            System.out.println(" Monday");
        else if ( futureDay == 2)
            System.out.println(" Tuesday");
        else if ( futureDay == 3)
            System.out.println(" Wednesday");
        else if ( futureDay == 4)
            System.out.println(" Thursday");
        else if ( futureDay == 5)
            System.out.println(" Friday");
        else if ( futureDay == 6)
            System.out.println(" Saturday");
        }
    }

