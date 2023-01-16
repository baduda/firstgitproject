package cards;

import java.util.Arrays;

public class Deck {
    private final Card[] cards;
    private int cardNumber = 0;


    public Deck() {
        Suite[] suites = Suite.values();
        CardValue[] values = CardValue.values();

        this.cards = new Card[suites.length * values.length];

        int i = 0;
        for (Suite suite : suites) {
            for (CardValue value : values) {
                cards[i++] = new Card(suite, value);
            }
        }
    }

    public void shuffle() {
        cardNumber = 0;

        for (int i = cards.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            // Simple swap
            Card a = cards[index];
            cards[index] = cards[i];
            cards[i] = a;
        }
    }

    public Card takeCard() {
        return cards[cardNumber++];
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}
