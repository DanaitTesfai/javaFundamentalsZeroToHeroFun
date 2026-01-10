package org.java_fundamentals._14_jdbc._01_studentApp.controller;

import org.java_fundamentals._14_jdbc._01_studentApp.model.Student;
import org.java_fundamentals._14_jdbc._01_studentApp.service.StudentService;
import org.java_fundamentals._14_jdbc._01_studentApp.service.impl.StudentServiceImpl;

import java.util.List;
import java.util.Optional;

public class StudentController {
    StudentService studentService = new StudentServiceImpl();

    public boolean createStudent(Student student) {
        return studentService.addStudent(student);
    }

    public List<Student> listStudents(){
        return studentService.getAllStudents();
    }

    public Optional<Student> findStudentById(int id){
        return studentService.getStudentById(id);
    }

    public boolean updateStudent(int id, String newName, String newEmail, String newPhone){
         return studentService.updateStudent(id,newName,newEmail,newPhone);
    }

    public boolean deleteStudentById(int id){
        return studentService.deleteStudentById(id);
    }


}
