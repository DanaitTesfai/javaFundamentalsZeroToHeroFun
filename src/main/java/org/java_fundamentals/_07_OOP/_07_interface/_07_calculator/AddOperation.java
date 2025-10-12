package org.java_fundamentals._07_OOP._07_interface._07_calculator;

public class AddOperation implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
