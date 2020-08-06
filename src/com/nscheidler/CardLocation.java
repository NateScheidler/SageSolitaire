package com.nscheidler;

public class CardLocation {
    private int row;
    private int col;

    public CardLocation(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
