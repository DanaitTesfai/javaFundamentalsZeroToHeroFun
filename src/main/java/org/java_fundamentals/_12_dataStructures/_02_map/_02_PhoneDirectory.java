package org.java_fundamentals._12_dataStructures._02_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_PhoneDirectory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneMap = new HashMap<>();

        phoneMap.put("Emma","9876543210");
        phoneMap.put("Alice","9876543220");
        phoneMap.put("Bob","9876543230");

        System.out.print("Enter name to get phone number: ");
        String name = sc.nextLine();

        for (String s: phoneMap.keySet()){
            if (s.equalsIgnoreCase(name)){
                System.out.println("Phone number for " + name + ": " + phoneMap.get(s));
                return;
            }
        }
        System.out.println("Name does not exist.");

    }
}
