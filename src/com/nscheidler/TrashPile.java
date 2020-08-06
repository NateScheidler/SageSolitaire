package com.nscheidler;

public class TrashPile {
    private int numTrashes;

    public void AddTrash() {
        if(this.numTrashes < 2) {
            this.numTrashes ++;
        }
    }

    public int getNumTrashes() {
        return this.numTrashes;
    }
}
