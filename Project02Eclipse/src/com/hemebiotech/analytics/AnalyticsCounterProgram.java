package com.hemebiotech.analytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class AnalyticsCounterProgram {
    ISymptomReader reader;
    ISymptomSort sorter;
    ISymptomWriter writer;

    /**
     * Constructor of the class AnalyticsCounterProgram
     * Instantiate the reader, writer and the sorter to enable the program to operate
     */
    public AnalyticsCounterProgram() {
        this.reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
        this.sorter = new SortSymptomData();
        this.writer = new WriteSymptomToDatafile("result.out");
    }

    /**
     * Function who recover, sort and write a list of symptoms with the attached count
     */
    public void start() throws IOException {
        ArrayList<String> listSymptoms;
        TreeMap<String, Integer> listSymptomsClean;
        listSymptoms = (ArrayList<String>) this.reader.getSymptoms();
        listSymptomsClean = this.sorter.cleanSymptoms(listSymptoms);
        this.writer.writeSymptomsFromList(listSymptomsClean);
    }
}
