package com.alanrussell.athletes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alanrussell on 30/10/2017.
 */

public class GymnastTest {
    private Gymnast gymnast;

    @Before
    public void setUp() throws Exception {
        gymnast = new Gymnast(5, 5);
    }

    @Test
    public void prepare() throws Exception {
        assertEquals("Preparing for event...", gymnast.prepare());
    }

    @Test
    public void compete() throws Exception {
        assertEquals("Competing in event...", gymnast.compete());
    }

    @Test
    public void calculatePoints() throws Exception {
        assertEquals(10, gymnast.calculatePoints());
    }

    @Test
    public void awardMedal() throws Exception {
        assertEquals(Medal.SILVER, gymnast.awardMedal());
    }
}
