package cards;

public class Card {
    private final Suite suite;
    private final CardValue value;

    public Card(Suite suite, CardValue value) {
        this.suite = suite;
        this.value = value;
    }

    public Suite getSuite() {
        return suite;
    }

    public CardValue getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suite=" + suite +
                ", value=" + value +
                '}';
    }
}
