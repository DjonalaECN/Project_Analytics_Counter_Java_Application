package com.hemebiotech.analytics;
import java.text.Collator;
import java.util.List;
import java.util.TreeMap;

public class SortSymptomData implements ISymptomSort {

    /**
     * Function who count & sort by order alphabetical a list of string (symptoms list)
     * @param list
     * @return TreeMap of symptoms with their count
     */
    public TreeMap<String, Integer> cleanSymptoms(List<String> list) {
        TreeMap<String,Integer> result;
        result = this.sortSymptomsByCount(list);
        result = this.sortSymptomsByAlphabeticalOrder(result);
        return result;
    }

    /**
     * Function who count the number of recurrences of symptoms and sort them by key : name of symptoms and by value : number of recurrences.
     * @param list
     */
    public TreeMap<String, Integer> sortSymptomsByCount(List<String> list) {
            TreeMap<String, Integer> listClean = new TreeMap<>();
            for(String symptoms : list) {
                if (listClean.isEmpty()) {
                    listClean.put(symptoms, 1);
                } else if (listClean.containsKey(symptoms)) {
                    int old = listClean.get(symptoms);
                    listClean.put(symptoms,old+ 1);
                } else {
                    listClean.put(symptoms, 1);
                }
            }
            return listClean;
        }

    /**
     * Function who sort by alphabetical order a treemap
     * @param list
     * @return A TreeMap
     */
    public TreeMap<String, Integer> sortSymptomsByAlphabeticalOrder(TreeMap<String, Integer> list) {
        TreeMap<String,Integer> sortedMap = new TreeMap(Collator.getInstance());
        sortedMap.putAll(list);
        return  sortedMap;
    }
}
