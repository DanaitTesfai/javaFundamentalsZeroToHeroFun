package org.java_fundamentals._12_dataStructures._02_map;

import java.util.HashMap;
import java.util.Map;

public class _07_FindMaximumValue {
    public static void main(String[] args) {
        Map<String, Integer> studentScore = new HashMap<>();

        studentScore.put("Alice", 90);
        studentScore.put("Bob", 85);
        studentScore.put("Mark", 95);
        studentScore.put("John", 60);

        String topStudent = "";
        int maxScore = Integer.MIN_VALUE;

        for (String s : studentScore.keySet()) {
            if (studentScore.get(s) > maxScore){
                maxScore = studentScore.get(s);
                topStudent = s;
            }
        }
        System.out.println("Student with highest score: " + topStudent);
    }

}
