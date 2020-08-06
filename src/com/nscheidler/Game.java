package com.nscheidler;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private TrashPile trashPile;
    private double multiplier;
    private double score;

    public boolean canMove(List<CardLocation> proposedCardLocations) throws InvalidMoveException {
        /*
        valid move:
            has cards in all locations
            spans more than one line
                if length 1, no need
            makes a score

        * */

        // valid move spans more than one line
        // valid move has cards to use in every stack
        // if move has more than one card, move must span multiple rows
        List<Card> cardsForMove = this.getCardsForMove(proposedCardLocations);




        return false;
    }

    private List<Card> getCardsForMove(List<CardLocation> proposedCardLocations) throws InvalidMoveException {
        List<Card> cards = new ArrayList<Card>();
        for(CardLocation cardLocation : proposedCardLocations) {
            Card card = this.board.peekCardAtLocation(cardLocation);
            if(card == null) {
                throw new InvalidMoveException();
            }
            cards.add(card);
        }

        return cards;
    }


}
