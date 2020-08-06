package com.nscheidler;

import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public Card dealCard() {
        return this.cards.remove(0);
    }
}
