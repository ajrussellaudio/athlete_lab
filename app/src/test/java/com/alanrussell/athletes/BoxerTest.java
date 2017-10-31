package com.alanrussell.athletes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alanrussell on 30/10/2017.
 */

public class BoxerTest {

    private Boxer boxer;
    private final double DISTANCES_DELTA = 0.01;

    @Before
    public void setUp() throws Exception {
        boxer = new Boxer(20, 5);
    }

    @Test
    public void prepare() throws Exception {
        assertEquals("Preparing for event...", boxer.prepare());
    }

    @Test
    public void compete() throws Exception {
        assertEquals("Competing in event...", boxer.compete());
    }

    @Test
    public void calculatePoints() throws Exception {
        assertEquals(15, boxer.calculatePoints());
    }

    @Test
    public void awardMedal() throws Exception {
        assertEquals(Medal.GOLD, boxer.awardMedal());
    }

    @Test
    public void distances_startsEmpty() throws Exception {
        assertEquals(0, boxer.totalDistance(), DISTANCES_DELTA);
    }

    @Test
    public void run() throws Exception {
        boxer.run(1.0);
        assertEquals(1.0, boxer.totalDistance(), DISTANCES_DELTA);
    }

    @Test
    public void distances_total() throws Exception {
        boxer.run(1.0);
        boxer.run(2.0);
        assertEquals(3.0, boxer.totalDistance(), DISTANCES_DELTA);
    }
}
