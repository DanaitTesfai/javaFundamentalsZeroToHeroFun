package org.java_fundamentals._14_jdbc._studentApp.service;

import org.java_fundamentals._14_jdbc._studentApp.dao.StudentDAO;
import org.java_fundamentals._14_jdbc._studentApp.dao.StudentDAOImpl;
import org.java_fundamentals._14_jdbc._studentApp.model.Student;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {
    private final StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    public boolean addStudent(Student student){
        if (isBlank(student.getName()) || isBlank(student.getEmail()) || isBlank(student.getPhoneNumber())){
            System.out.println("Name or email or phone can not be empty.");
            return false;
        }

        if (!student.getEmail().contains("@")){
            System.out.println("Invalid email format. Missing '@' symbol.");
            return false;
        }
        return studentDAO.save(student);
    }

    private boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }

    @Override
    public Optional<Student> getStudentById(int id){
        if (id <= 0){
            return Optional.empty();
        }else {
            return studentDAO.findById(id);
        }
    }

    @Override
    public boolean updateStudent(int id, String newName, String newEmail, String newPhone){
        if (id <= 0){
            System.out.println("Id must be greater than 0.");
            return false;
        }
        if (isBlank(newName) || isBlank(newEmail) || isBlank(newPhone)){
            System.out.println("Name or email or phone can not be empty.");
            return false;
        }

        if (!newEmail.contains("@")){
            System.out.println("Invalid email format. Missing '@' symbol.");
            return false;
        }
        return studentDAO.updateStudent(id,newName,newEmail, newPhone);

    }

    @Override
    public boolean deleteStudentById(int id){
        if (id <= 0){
            System.out.println("Id must be greater than 0.");
            return false;
        }
        return studentDAO.deleteStudentById(id);

    }

}
