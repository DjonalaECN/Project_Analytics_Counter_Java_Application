package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class WriteSymptomToDatafile implements ISymptomWriter{
    private FileWriter writer;

    /**
     * Constructor for class WriteSymptomDataResult
     * @param filepath
     */
    public WriteSymptomToDatafile(String filepath){
        try {
            this.writer = new FileWriter(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Function who create a file and write to it all the name of symptoms and their number of recurrences from the datasource
     * The hastable list must have for key the name of symptom and for value the number of recurrences
     * @param listSymptomsClean
     */
    public void WriteSymptomsFromList(TreeMap<String, Integer> listSymptomsClean ) throws IOException {
        Set<String> keys = listSymptomsClean.keySet();
        Iterator<String> iterator = keys.iterator();
        String str;

        while (iterator.hasNext()) {
            str = iterator.next();
            writer.write(str+" = "+listSymptomsClean.get(str) + "\n" );
        }
        writer.close();
    }
}
