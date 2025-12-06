package org.java_fundamentals._12_dataStructures._02_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_CountCharacterOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0)+1);
            System.out.println(frequency);
        }
    }
}
