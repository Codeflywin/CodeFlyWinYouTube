package Chapter1;

//Create a class that displays the result of the Gregory - Leibniz Series
// First 4 x ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
// Second 4 x ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
//1.0 Needs to be used in the calculations to let Java know that we are not doing integer, or whole number division
public class ProblemNo7 {
    public static void main(String[] args) {
        System.out.println(4 * (1.0 - (1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));
        System.out.println(4 * (1.0 - (1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13)));
    }
}
