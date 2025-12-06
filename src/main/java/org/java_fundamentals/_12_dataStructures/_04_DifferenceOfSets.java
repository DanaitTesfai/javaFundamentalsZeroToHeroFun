package org.java_fundamentals._12_dataStructures;

import java.util.HashSet;
import java.util.Set;

public class _04_DifferenceOfSets {
    public static void main(String[] args) {
        Set<String> fruits1 = new HashSet<>();
        Set<String> fruits2 = new HashSet<>();

        fruits1.add("Apple");
        fruits1.add("Mango");

        fruits2.add("Mango");
        fruits2.add("Orange");

        /*for (String s : fruits1) {
           if (!fruits2.contains(s)){
               System.out.println(s);
           }
        }*/

        fruits1.removeAll(fruits2);
        System.out.println(fruits1);


    }
}
