package com.alanrussell.athletes;

/**
 * Created by alanrussell on 30/10/2017.
 */

public class Boxer extends Athlete {

    private int hitsGiven;
    private int hitsTaken;

    public Boxer(int hitsGiven, int hitsTaken) {
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    @Override
    public int calculatePoints() {
        return hitsGiven - hitsTaken;
    }

}
