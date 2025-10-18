package Chapter3;

public class ProblemNo24 {
    public static void main(String[] args) {
        final int totalcards = 52;
        int cardNo = (int) (Math.random() * totalcards);
        System.out.print("The card you picked is ");
//We need to modulo by 13 to get the remainder, since there are 13 different cards in each of the 4 suits
        if (cardNo % 13 == 0)
            System.out.print("Ace of ");
        else if (cardNo % 13 == 10)
            System.out.print("Jack of ");
        else if (cardNo % 13 == 11)
            System.out.print("Queen of ");
        else if (cardNo % 13 == 12)
            System.out.print("King of ");
        else
            System.out.print((cardNo % 13) + " of ");
//There are 4 suits, so we need to divide the card number by 13
        if (cardNo / 13 == 0)
            System.out.println("Clubs");
        else if (cardNo / 13 == 1)
            System.out.println("Diamonds");
        else if (cardNo / 13 == 2)
            System.out.println("Hearts");
        else if (cardNo / 13 == 3)
            System.out.println("Spades");
    }
}