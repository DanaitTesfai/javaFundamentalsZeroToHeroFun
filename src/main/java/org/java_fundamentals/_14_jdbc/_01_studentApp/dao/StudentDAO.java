package org.java_fundamentals._14_jdbc._01_studentApp.dao;

import org.java_fundamentals._14_jdbc._01_studentApp.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {
    //CRUD operations
    boolean save(Student student);
    List<Student> findAll();
    Optional<Student> findById(int id);
    boolean updateStudent(int id, String newName, String newEmail, String newPhone);
    boolean deleteStudentById(int id);
}
