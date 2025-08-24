package org.java_fundamentals._06_arrays;

public class _02_SumOfArray {
    public static void main(String[] args) {
        int [] numbers = {5, 10, 15, 20};

        int sum = 0 ;
        String result = "";
        for (int i = 0 ; i < numbers.length ; i++) {
            sum += numbers[i] ;
            result += i < numbers.length - 1 ? numbers[i] + " + " : numbers[i] + " = " ;
        }
        System.out.println(result + sum);
    }
}
