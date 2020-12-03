package com.hemebiotech.analytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class AnalyticsCounterProgram {
    ISymptomReader reader;
    ISymptomSort sorter;

    /**
     * Constructor of the class AnalyticsCounterProgram
     * Instantiate the reader, writer and the sorter to enable the program to operate
     */
    public AnalyticsCounterProgram() {
        this.reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
        this.sorter = new SortSymptomData();

    }

    /**
     * Function who recover, sort and write a list of symptoms with the attached count
     */
    public void start() throws IOException {
        ArrayList<String> listSymptoms;
        TreeMap<String, Integer> listSymptomsClean;
        listSymptoms = (ArrayList<String>) this.reader.GetSymptoms();
        listSymptomsClean = this.sorter.CleanSymptoms(listSymptoms);
    }
}
