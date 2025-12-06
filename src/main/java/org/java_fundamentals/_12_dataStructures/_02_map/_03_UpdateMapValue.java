package org.java_fundamentals._12_dataStructures._02_map;

import java.util.HashMap;
import java.util.Map;

public class _03_UpdateMapValue {
    public static void main(String[] args) {
        Map<String, Integer> studentGrade = new HashMap<>();

        studentGrade.put("Alice", 80);
        studentGrade.put("Bob", 90);

        System.out.println("Original grades: " + studentGrade);
        for (String s: studentGrade.keySet()){
            if (s.equalsIgnoreCase("Alice")){
                studentGrade.put(s, 85);
                System.out.println("Updated grades: " + studentGrade);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
