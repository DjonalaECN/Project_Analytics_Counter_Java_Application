package com.hemebiotech.analytics;
import java.util.List;
import java.util.TreeMap;

/**
 * For any class who needs to sort symptoms
 */
public interface ISymptomSort {
    /**
     * Function who count & sort by order alphabetical a list of string (symptoms list)
     * @param list
     * @return TreeMap of symptoms with their count
     */
    TreeMap<String, Integer> cleanSymptoms(List<String> list);

    /**
     * Function who count the number of recurrences of symptoms and sort them by key : name of symptoms and by value : number of recurrences
     *
     * @param list
     * @return
     */
    TreeMap<String, Integer> sortSymptomsByCount (List<String> list);

    /**
     * Function who sort by alphabetical order a treemap
     * @param list
     * @return
     */
    TreeMap<String, Integer> sortSymptomsByAlphabeticalOrder(TreeMap<String, Integer> list);
}
