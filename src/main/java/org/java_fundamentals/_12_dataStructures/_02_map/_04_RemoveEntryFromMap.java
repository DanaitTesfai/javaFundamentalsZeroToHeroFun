package org.java_fundamentals._12_dataStructures._02_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_RemoveEntryFromMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, String> studentInfo = new HashMap<>();

        System.out.print("How many students do you want to register? ");
        int studentNum = sc.nextInt();

        String name = "";
        int id = 0;

        for (int i= 0 ; i < studentNum ; i++){
            System.out.print("Enter student id: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter student name: ");
            name = sc.nextLine();

            studentInfo.put(id, name);

        }
        System.out.println(studentInfo);

        System.out.print("Enter student id to remove: ");
        id= sc.nextInt();


        String removedStudent = studentInfo.remove(id);
        if (removedStudent == null){
            System.out.println("Student not found.");
            return;
        }
        System.out.println("Student removed successfully.");

        System.out.println(studentInfo);

    }
}
