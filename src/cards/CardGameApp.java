package cards;

public class CardGameApp {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Card trumpCard = deck.takeCard();

        System.out.println("trump suite = " + trumpCard.getSuite());

        PlayerHand player1 = createHand(deck);
        PlayerHand player2 = createHand(deck);
        PlayerHand player3 = createHand(deck);

        System.out.println("player1 = " + player1);
        System.out.println("player2 = " + player2);
        System.out.println("player3 = " + player3);
    }

    static PlayerHand createHand(Deck deck) {
        return new PlayerHand(deck.takeCard());
    }
}
