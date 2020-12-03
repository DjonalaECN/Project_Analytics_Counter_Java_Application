package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public interface ISymptomWriter {

    /**
     * Function who create a file and write to it all the name of symptoms and their number of recurrences from the datasource
     * The hastable list must have for key the name of symptom and for value the number of recurrences
     * @param listSymptomsClean
     */
    void WriteSymptomsFromList(TreeMap<String, Integer> listSymptomsClean) throws IOException;
}
