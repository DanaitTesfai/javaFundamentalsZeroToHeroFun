package org.java_fundamentals._05_looping._01_coding_challenges;

public class _06_PrintingTo10 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++ ){
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("Break statement");
        for (int i = 1 ; i <= 10 ; i++ ){
            if (i == 5){
                break;
            }
            System.out.print(i + " ");

        }

        System.out.println("\n");
        System.out.println("Continue statement");
        for (int i = 1 ; i <= 10 ; i++ ){
            if (i == 5){
                continue;
            }
            System.out.print(i + " ");
        }


        System.out.println("\n");
        System.out.println("Sum");
        int sum = 0;
        for (int i = 1 ; i <= 10 ; i++ ){
            sum += i;
            if (i < 10) {
                System.out.print(i + " + ");
            } else if (i == 10) {
                System.out.print(i + " = ");
            }
        }
        System.out.println(sum);


        System.out.println("\n");
        System.out.println("Even numbers");
        int i = 0 ;
        while (i <= 20){
            if (i % 2 == 0) {
                System.out.print(i + " ");
                i++;
               continue;
            }
            i++;

        }








    }
}
