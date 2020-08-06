package com.nscheidler;

import java.util.ArrayList;
import java.util.List;

public class DeckFactory {
    public Deck buildSingleDeck() {
        List<Card> cards = new ArrayList<Card>();
        for(Suit suit : Suit.values()) {
            for(int i = 1; i < 14; i++) {
                Card card = new Card(suit, i);
                cards.add(card);
            }
        }

        return new Deck(cards);
    }
}
