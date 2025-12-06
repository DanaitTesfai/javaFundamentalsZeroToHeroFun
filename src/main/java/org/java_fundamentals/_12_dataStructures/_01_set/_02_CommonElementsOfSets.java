package org.java_fundamentals._12_dataStructures._01_set;

import java.util.HashSet;
import java.util.Set;

public class _02_CommonElementsOfSets {
    public static void main(String[] args) {
        Set<Integer> int1 = new HashSet<>();
        Set<Integer> int2 = new HashSet<>();

        int1.add(2);
        int1.add(3);
        int1.add(4);
        int1.add(5);

        int2.add(3);
        int2.add(4);
        int2.add(7);
        int2.add(8);

        /*for (Integer i : int1) {
            if (!int2.add(i)){
                System.out.println(i);
            }
        }*/

        int1.retainAll(int2);
        System.out.println(int1);

    }
}
