package org.java_fundamentals._12_dataStructures._01_set;

import java.util.HashSet;
import java.util.Set;

public class _06_RemoveElements {
    public static void main(String[] args) {
        Set<Integer> ints = new HashSet<>();

        ints.add(5);
        ints.add(10);
        ints.add(30);
        ints.add(45);
        ints.add(55);
        ints.add(65);

        ints.removeIf(n -> n > 50);
        System.out.println(ints);
    }
}
