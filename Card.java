final class Card {
    private int num;
    private char suit;

    public Card() {}

    public Card(int num, char suit) {
        this.num = num;
        this.suit = suit;
    }

    public int getNum() {
        return this.num;
    }

    public char getSuit() {
        return this.suit;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public String toString() {
        //return this.getNum() + ", " + this.getSuit();
        String suit;
        String cardName;

        if (this.getSuit() == 'C') {
            suit = "Clubs";
        } else if (this.getSuit() == 'S') {
            suit = "Spades";
        } else if (this.getSuit() == 'H') {
            suit = "Hearts";
        } else if (this.getSuit() == 'D') {
            suit = "Diamonds";
        } else {
            suit = "Nothing";
        }

        if (this.getNum() == 1) {
            cardName = "Ace";
        } else if (this.getNum() == 11) {
            cardName = "Jack";
        } else if (this.getNum() == 12) {
            cardName = "Queen";
        } else if (this.getNum() == 13) {
            cardName = "King";
        } else if (this.getNum() > 1 && this.getNum() < 11) {
            cardName = this.getNum() + "";
        } else {
            cardName = "Glitch";
        }

        return cardName + " of " + suit;
    }
}