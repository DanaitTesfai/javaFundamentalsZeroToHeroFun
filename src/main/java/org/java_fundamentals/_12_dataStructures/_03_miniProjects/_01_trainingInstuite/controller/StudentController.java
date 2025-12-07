package org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.controller;

import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.model.Student;
import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.repository.FileStudentRepository;
import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.service.StudentService;

import java.util.List;

public class StudentController {
    StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    public void addStudent(int id,String name, String course){
        try{
            Student student = new Student(id, name, course);
            studentService.addStudent(student);
            System.out.println("Student added successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void viewStudents(){
        try{
            List<Student> students = studentService.getAllStudents();
            if (students.isEmpty()){
                System.out.println("There are no students to view.");
                return;
            }
            System.out.println("Registered students: ");
            for (Student s: students){
                System.out.println(s);
            }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
