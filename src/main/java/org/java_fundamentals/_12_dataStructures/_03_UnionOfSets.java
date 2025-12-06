package org.java_fundamentals._12_dataStructures;

import java.util.HashSet;
import java.util.Set;

public class _03_UnionOfSets {
    public static void main(String[] args) {
        Set<String> str1 = new HashSet<>();
        Set<String> str2 = new HashSet<>();

        str1.add("Java");
        str1.add("Python");

        str2.add("C++");
        str2.add("C#");

        str1.addAll(str2);

        System.out.println("Union of sets:");
        for (String s : str1) {
            System.out.println(s);
        }

    }
}
