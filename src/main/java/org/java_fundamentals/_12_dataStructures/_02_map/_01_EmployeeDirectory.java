package org.java_fundamentals._12_dataStructures._02_map;

import java.util.HashMap;
import java.util.Map;

public class _01_EmployeeDirectory {
    public static void main(String[] args) {
        Map<Integer, String> employeesMap = new HashMap<>();

        employeesMap.put(101, "Alice");
        employeesMap.put(102, "Bob");
        employeesMap.put(103, "John");
        employeesMap.put(101, "Danait");
        employeesMap.put(104, "Danait");

        // Using entrySet() to get a set of key-value pairs
        System.out.println("Employee Directory:");
        for (Map.Entry<Integer, String> entry : employeesMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();
        System.out.println();
        System.out.println();


        // Using keySet() to iterate through keys
        for (Integer id: employeesMap.keySet()){
            System.out.println(id + " - " + employeesMap.get(id));
        }
        System.out.println();
        System.out.println();


        // Using values() to iterate through values
        for (String value: employeesMap.values()){
            System.out.println( value);
        }


    }
}
