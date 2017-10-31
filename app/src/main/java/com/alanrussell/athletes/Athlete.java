package com.alanrussell.athletes;

import com.alanrussell.athletes.logging.Loggable;

import java.util.ArrayList;

/**
 * Created by alanrussell on 30/10/2017.
 */

public abstract class Athlete {

    private ArrayList<Double> distances;

    public Athlete() {
        distances = new ArrayList<Double>();
    }

    public String prepare() {
        return "Preparing for event...";
    }

    public String compete() {
        return "Competing in event...";
    }

    public abstract int calculatePoints();

    public Medal awardMedal() {
        int points = calculatePoints();
        if (points >= 15) return Medal.GOLD;
        if (points >= 10) return Medal.SILVER;
        if (points >= 5) return Medal.BRONZE;
        return null;
    }

    public void enterEvent() {
        System.out.println(prepare());
        System.out.println(compete());
        Medal medal = awardMedal();
        System.out.println(medal.toString());
    }

    public double totalDistance() {
        double total = 0;
        for (double session : distances) {
            total += session;
        }
        return total;
    }

    public void run(double distance) {
        distances.add(distance);
    }

    public void log(Loggable logger) {
        logger.log(distances);
    }
}
