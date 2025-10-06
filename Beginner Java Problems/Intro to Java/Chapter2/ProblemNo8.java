package Chapter2;

import java.util.Scanner;


public class ProblemNo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        long offset = scan.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long yourtime = (totalHours + offset) % 24;
        System.out.println("The current time is : " + yourtime + ":" + currentMinutes + ":" + currentSeconds);
    }
}
