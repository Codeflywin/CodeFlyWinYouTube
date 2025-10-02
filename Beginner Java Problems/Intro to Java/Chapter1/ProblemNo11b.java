package Chapter1;

public class ProblemNo11b {
    public static void main(String[] args) {
        long seconds =  365 * 24 * 60 * 60;
        long births = seconds / 7;
        long deaths = seconds / 13;
        long newimmigrants = seconds / 45;
        long currentpop = 312032486;

        for (int year = 1; year <= 5; year++) {
            long newpop = currentpop + births+ newimmigrants - deaths;
            System.out.printf("Year %d: %d + %d + %d - %d = %d%n ",year, currentpop, births, newimmigrants, deaths, newpop).println();
currentpop = newpop;
        }
    }
}
