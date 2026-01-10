package org.java_fundamentals._14_jdbc._01_studentApp.service;

import org.java_fundamentals._14_jdbc._01_studentApp.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    boolean addStudent(Student student);

    List<Student> getAllStudents();

    Optional<Student> getStudentById(int id);

    boolean updateStudent(int id, String newName, String newEmail, String newPhone);

    boolean deleteStudentById(int id);
}
