package Chapter3;

public class Exercise_3_16 {
    public static void main (String[] args) {

        // Math random will generate a double between 0 and 1 (1 is not inclusive), so if we multiply it by 50,
        // the highest value it can give us is 49,the width of the square is 50, therefore since we have
        //values from -25 to 25, we must subtract 25 to make the max x value 24, or -24
        int x = (int)  ((Math.random() * 50) - 25);
        // For y values 0.99 multiplied by 150, gives us a max value of 148.5 so we need to subtract 75
        int y = (int)  ((Math.random() * 150) - 75);
        System.out.println("The coordinates are: " + x +"," +y);
    }
}
