package com.nscheidler;

public class CardStack {
    private Card topCard;
    private int numCards;
    private Deck deck;

    public CardStack(Deck deck, int numCards) {
        this.deck = deck;
        this.numCards = numCards;
        this.topCard = deck.dealCard();
    }

    public Card peekTopCard() {
        return this.topCard;
    }

    public int getNumCards() {
        return this.numCards;
    }

    public void removeTopCard() throws Exception {
        if(this.numCards == 0) {
            throw new Exception("no card in stack");
        }
        if(this.numCards == 1) {
            this.topCard = null;
        }
        this.numCards--;
        this.topCard = this.deck.dealCard();
    }
}
