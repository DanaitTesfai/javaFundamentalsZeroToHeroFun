package org.java_fundamentals._12_dataStructures._01_set;

import java.util.HashSet;
import java.util.Set;

public class _05_CheckEmptySet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        if (names.isEmpty()){
            System.out.println("The names Set is empty.");
        }else {
            for (String s: names){
                System.out.println(s);
            }
        }


    }
}
