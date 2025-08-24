package org.java_fundamentals._06_arrays._01_codingChallenges;

public class _03_AverageOfArray {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 6, 8, 12};

        int sum = 0;
        double average = 0;
        for (int i = 0 ; i < numbers.length ; i++) {
            sum += numbers[i];

        }
        average = (double)sum / numbers.length;
        System.out.println(average);

    }
}
