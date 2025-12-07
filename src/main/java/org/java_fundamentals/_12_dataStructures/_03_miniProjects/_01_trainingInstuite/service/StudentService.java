package org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.service;

import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.model.Student;
import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.repository.FileStudentRepository;
import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.repository.StudentRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentService {
    StudentRepository studentRepository ;
    Set<Integer> studentIds = new HashSet<>();


    public StudentService(StudentRepository studentRepository) throws Exception{
        this.studentRepository = studentRepository;
        List<Student> students = studentRepository.findAll();
        for (Student s: students){
            studentIds.add(s.getId());
        }
    }


    public void addStudent(Student student) throws Exception{
        if (studentIds.contains(student.getId())){
            throw new Exception("Student already exists.");
        }

        studentIds.add(student.getId());
        studentRepository.save(student);

    }

    public List<Student> getAllStudents() throws Exception{
        return studentRepository.findAll();
    }
}
