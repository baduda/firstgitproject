package cards;

import java.util.Arrays;

public class PlayerHand {
    private final Card[] cards;

    public PlayerHand(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "PlayerHand{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}
