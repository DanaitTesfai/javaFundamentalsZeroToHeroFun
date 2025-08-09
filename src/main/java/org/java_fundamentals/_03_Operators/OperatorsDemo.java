package org.java_fundamentals._03_Operators;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        int additionResult = a + b;
        System.out.println("Addition: " + additionResult);

        int multiplicationResult = a * b;
        System.out.println("Multiplication: " + multiplicationResult);

        int remainderResult = b % a;
        System.out.println("Remainder: " + remainderResult);

        boolean com1 = a > 2;
        boolean com2 = b > 16;
        System.out.println("Comparison 1: " + com1);
        System.out.println("Comparison 2: " + com2);

        boolean logicalAnd = a <= 8 && b < 9;
        System.out.println("Logical And: " + logicalAnd);

        boolean reverseLogicalAnd = ! logicalAnd;
        System.out.println("Reverse logical And: " + reverseLogicalAnd);

        int x = 6, y = 9;
        int result = 0;            //x = 6+1=7, y=9-1=8
        result = x++ + --y;
        // result = 6 + 8
        System.out.println("x= " + x + " y= " + y + " Result= " + result);

        result = ++x + y++ + --y;    // x=7+1=8, y=8+1=9-1=8
        //result = 8 + 8 + 8=24
        System.out.println("x= " + x + " y= " + y + " Result= " + result);







    }

}
