package com.nscheidler;

public class Board {
    private CardStack[][] cardStacks;

    public Card peekCardAtLocation(CardLocation cardLocation) {
        return this.cardStacks[cardLocation.getRow()][cardLocation.getCol()].peekTopCard();
    }
}
