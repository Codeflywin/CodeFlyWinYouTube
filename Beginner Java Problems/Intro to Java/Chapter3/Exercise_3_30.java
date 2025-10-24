package Chapter3;
import java.util.Scanner;
public class Exercise_3_30 {
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
        long finalhour = yourtime == 12 ? yourtime = 0 : yourtime + 12;
        if (finalhour < 12)
            System.out.println("The current time is : " + (yourtime % 12) + ":" + currentMinutes + ":" + currentSeconds + " AM");
        else
            System.out.println("The current time is : " + (yourtime % 12) + ":" + currentMinutes + ":" + currentSeconds + " PM");
        scan.close();
    }
}
