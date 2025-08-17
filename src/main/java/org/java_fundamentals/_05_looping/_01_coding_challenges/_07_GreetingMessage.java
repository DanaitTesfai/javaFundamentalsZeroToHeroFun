package org.java_fundamentals._05_looping._01_coding_challenges;

public class _07_GreetingMessage {
    public static void main(String[] args) {
        System.out.println("Hello " + "World");

        String result = "";
        for (int i = 1; i <=5 ; i++){
            result += i + " ";
        }
        System.out.println(result);

        String java = "";
        for (int i = 1; i<= 5 ; i++){
            java += "java ";
        }
        System.out.print(java);
    }
}
