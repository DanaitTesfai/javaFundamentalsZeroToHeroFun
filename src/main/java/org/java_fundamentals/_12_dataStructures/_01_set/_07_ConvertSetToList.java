package org.java_fundamentals._12_dataStructures._01_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _07_ConvertSetToList {
    public static void main(String[] args) {
        Set<String> coloursSet = new HashSet<>();

        coloursSet.add("Red");
        coloursSet.add("Green");
        coloursSet.add("Blue");

        List<String> coloursList = new ArrayList<>(coloursSet);

        System.out.println(coloursList);

    }
}
