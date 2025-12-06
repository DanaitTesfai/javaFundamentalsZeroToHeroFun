package org.java_fundamentals._12_dataStructures._02_map;

import java.util.HashMap;
import java.util.Map;

public class _01_EmployeeDirectory {
    public static void main(String[] args) {
        Map<Integer, String> employeesMap = new HashMap<>();

        employeesMap.put(101, "Alice");
        employeesMap.put(102, "Bob");
        employeesMap.put(103, "John");

        System.out.println("Employee Directory:");
        for (Map.Entry<Integer, String> entry : employeesMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
