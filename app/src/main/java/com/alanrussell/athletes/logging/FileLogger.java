package com.alanrussell.athletes.logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by alanrussell on 31/10/2017.
 */

public class FileLogger implements Loggable {

    @Override
    public void log(ArrayList<Double> distances){
        String filePath = "distances.txt";
        File file = new File (filePath);
        file.getParentFile().mkdirs();
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (double distance : distances){
                printWriter.println("You ran " + distance + " miles");
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
