package Chapter1;

public class Exercise_1_11 {
    public static void main(String[] args) {
        //There are 365 days
        //Each day has 24 hours 365 * 24
        System.out.println("Each year has " + 365 * 24 + " hours.");
        //Each hour equals 60 minutes
        System.out.println("Each year has " + 365 * 24 * 60 + " minutes.");
        //Each hour has 60 seconds
        System.out.println("Each year has " + 365 * 24 * 60 * 60 + " seconds.");
        //The world population is 312,032,486
        //There is one birth every 7 seconds
        System.out.println("Each year there are " + 31536000 / 7.0 + " births.");
        //Each year there is one death every 13 seconds
        System.out.println("Each year there are " + 31536000 / 13.0 + " deaths.");
        //Each year there is one new immigrant every 45 seconds
        System.out.println("Each year there are " + 31536000 / 45.0 + " new immigrants.");
        //In year 1 what will be the new population?
        System.out.println("The first year the new population will be: " + (((312032486 + (31536000 / 7.0)) + (31536000 / 45.0) -(31536000 / 13.0))));
        //Hello Scientific notation...
        //Year 2 Results
        System.out.println("The second year the new population will be: " + (((3.148125827032967E8 + (31536000 / 7.0)) + (31536000 / 45.0) -(31536000 / 13.0))));
        //Year 3 Results
        System.out.println("The third year the new population will be: " + (((3.1759267940659344E8 + (31536000 / 7.0)) + (31536000 / 45.0) -(31536000 / 13.0))));
        //Year 4 Results
        System.out.println("The fourth year the new population will be: " + (((3.2037277610989016E8 + (31536000 / 7.0)) + (31536000 / 45.0) -(31536000 / 13.0))));
        //Year 5 Results
        System.out.println("The fifth year the new population will be: " + (((3.231528728131869E8 + (31536000 / 7.0)) + (31536000 / 45.0) -(31536000 / 13.0))));

    }
}
