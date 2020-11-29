package com.hemebiotech.analytics;
import java.util.ArrayList;

public class AnalyticsCounterProgram {
    ISymptomReader reader;


    /**
     * Constructor of the class AnalyticsCounterProgram
     * Instantiate the reader, writer and the sorter to enable the program to operate
     */
    public AnalyticsCounterProgram() {
        this.reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

    }

    /**
     * Function who recover, sort and write a list of symptoms with the attached count
     */
    public void start() {
        ArrayList<String> listSymptoms;
        listSymptoms = (ArrayList<String>) this.reader.GetSymptoms();
    }
}
