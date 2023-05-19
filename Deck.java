
final class Deck {
    private int numOfCards = 52;
    private Card[] deck = new Card[numOfCards];

    public Deck() {
        int num = 1;
        char suit = 'C';

        for (int i = 0; i < numOfCards; ++i) {
            
            deck[i] = new Card(num, suit);
            ++num;
            if (num == 14 && suit == 'C') {
                num = 1;
                suit = 'S';
            } else if (num == 14 && suit == 'S') {
                num = 1;
                suit = 'H';
            } else if (num == 14 && suit == 'H') {
                num = 1;
                suit = 'D';
            }

        }

    }

    public Card getCard(int index) {
        return deck[index];
    }

    public void setCard(int num, char suit, int index) {
        deck[index].setNum(num);
        deck[index].setSuit(suit);
    }

    public void shuffleDeck() {
        
    }
}