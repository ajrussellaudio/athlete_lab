package com.alanrussell.athletes.logging;

import java.util.ArrayList;

/**
 * Created by alanrussell on 30/10/2017.
 */

public class ConsoleLogger implements Loggable {

    @Override
    public void log(ArrayList<Double> distances) {
        System.out.println(distances);
    }

}
