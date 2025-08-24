package org.java_fundamentals._06_arrays;

public class _01_PrintArray {
    public static void main(String[] args) {
        int [] numbers =  {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
