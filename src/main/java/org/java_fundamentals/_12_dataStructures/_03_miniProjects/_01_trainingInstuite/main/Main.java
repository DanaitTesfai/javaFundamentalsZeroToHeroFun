package org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.main;

import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.controller.StudentController;
import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.repository.FileStudentRepository;
import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.repository.StudentRepository;
import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.service.StudentService;
import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.view.StudentView;

public class Main {
    public static void main(String[] args) {
        try{
            StudentRepository studentRepository = new FileStudentRepository();
            StudentService studentService = new StudentService(studentRepository);
            StudentController studentController = new StudentController(studentService);
            StudentView studentView = new StudentView(studentController);

            studentView.start();

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}
