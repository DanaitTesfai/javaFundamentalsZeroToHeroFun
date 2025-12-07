package org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.repository;

import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStudentRepository implements StudentRepository {
    File file = new File("students_mvc.txt");

    @Override
    public void save(Student student) throws Exception {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            writer.write(student.toString());
            writer.newLine();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Student> findAll() throws Exception {
        List<Student> students = new ArrayList<>();
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                String[] lineArray = line.split(",");
                int id = Integer.parseInt(lineArray[0]);
                String name = lineArray[1];
                String course = lineArray[2];

                Student student = new Student(id,name,course);
                students.add(student);
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return students;
    }
}
