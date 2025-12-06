package org.java_fundamentals._12_dataStructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_UniqueUsernames {
    public static void main(String[] args) {
        Set<String> usernames = new HashSet<>();

        usernames.add("alice");
        usernames.add("bob");
        usernames.add("alice");
        usernames.add("john");
        usernames.add("bob");

        for (String username : usernames) {
            System.out.println(username);
        }

    }
}