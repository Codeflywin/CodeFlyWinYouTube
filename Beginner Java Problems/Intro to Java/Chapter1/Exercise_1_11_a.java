package Chapter1;

public class Exercise_1_11_a {
    public static void main(String[] args) {
        long seconds =  365 * 24 * 60 * 60;
        long births = seconds / 7;
        long deaths = seconds / 13;
        long newimmigrants = seconds / 45;
        long currentpop = 312032486;
        long popyearone = currentpop + births + newimmigrants - deaths;
        long popyeartwo = popyearone + births+ newimmigrants - deaths;
        long popyearthree = popyeartwo + births+ newimmigrants - deaths;
        long popyearfour = popyearthree + births+ newimmigrants - deaths;
        long popyearfive = popyearfour + births+ newimmigrants - deaths;
        System.out.println("Population for year one is: " + popyearone);
        System.out.println("Population for year two is: " + popyeartwo);
        System.out.println("Population for year three is: " + popyearthree);
        System.out.println("Population for year four is: " + popyearfour);
        System.out.println("Population for year five is: " + popyearfive);
    }
}
