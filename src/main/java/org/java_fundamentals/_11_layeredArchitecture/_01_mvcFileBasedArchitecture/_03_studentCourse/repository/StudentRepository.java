package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    File studentFile = new File("students_db.txt");

    public void saveAllStudentsToFile(List<Student> students){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(studentFile))){
            for (Student s: students){
                writer.write(s.getStudentId()+ "," + s.getStudentName());
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public List<Student> loadAllStudentsFromFile(){
        List<Student> students = new ArrayList<>();
        try{
            if (!studentFile.exists()){
                studentFile.createNewFile();
            }
            try(BufferedReader reader = new BufferedReader(new FileReader(studentFile))){
                String line;
                while ((line = reader.readLine()) != null){
                    String[] lineArray = line.split(",");
                    int studentId = Integer.parseInt(lineArray[0]);
                    String studentName = lineArray[1];

                    Student student = new Student(studentId, studentName);
                    students.add(student);

                }

            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return students;
    }
}
