package org.java_fundamentals._12_dataStructures._02_map;

import java.util.HashMap;
import java.util.Map;

public class _07_FindMaximumValue {
    public static void main(String[] args) {
        Map<String, Integer> studentScore = new HashMap<>();

        studentScore.put("Alice", 95);
        studentScore.put("Bob", 85);
        studentScore.put("Mark", 95);
        studentScore.put("John", 60);

        //singleStudent(studentScore);
        multipleStudent(studentScore);




        //step 1 first find the highest score in the map
        //step 2 print out student names having the same max score you found in step 1
    }

    public static void multipleStudent(Map<String, Integer> studentScore){
        String topStudent = "";
        int maxScore = Integer.MIN_VALUE;

        for (String s: studentScore.keySet()){
            System.out.println(studentScore.get(s) + ">" + maxScore + (studentScore.get(s) > maxScore));
            if (studentScore.get(s)> maxScore){
                maxScore = studentScore.get(s);

            }
            System.out.println("Current max: "  + maxScore);
        }
        System.out.println("Maximum score is " + maxScore);
        System.out.println("And the following students are having the maximum score.");
        for (String s: studentScore.keySet()){
            if (studentScore.get(s) == maxScore){
                System.out.println(s);
            }
        }

    }

    private static void singleStudent(Map<String, Integer> studentScore) {
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
