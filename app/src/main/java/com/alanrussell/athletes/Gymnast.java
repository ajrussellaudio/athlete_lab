package com.alanrussell.athletes;

/**
 * Created by alanrussell on 30/10/2017.
 */

public class Gymnast extends Athlete {

    private int difficulty;
    private int execution;

    public Gymnast(int difficulty, int execution) {
        this.difficulty = difficulty;
        this.execution = execution;
    }

    @Override
    public int calculatePoints() {
        return difficulty + execution;
    }
}
