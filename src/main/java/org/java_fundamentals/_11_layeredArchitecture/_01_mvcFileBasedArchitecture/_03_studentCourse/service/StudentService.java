package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.service;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Student;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository.StudentRepository;

import javax.xml.transform.Source;
import java.util.List;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();
    EnrollmentService enrollmentService = new EnrollmentService();



    public void addStudent(String studentName){
        if (studentName == null || studentName.trim().isEmpty()){
            System.out.println("Student name can not be empty.");
            return;
        }
        List<Student> students = studentRepository.loadAllStudentsFromFile();
        for (Student s: students){
            if (s.getStudentName().equalsIgnoreCase(studentName.trim())){
                System.out.println("Student name already exists.");
                return;
            }
        }

        int newId = students.isEmpty() ? 1 : students.get(students.size()-1).getStudentId()+1;
        Student newstudent = new Student(newId, studentName);
        students.add(newstudent);
        studentRepository.saveAllStudentsToFile(students);
        System.out.println("Student added successfully.");
    }




    public List<Student> getAllStudents(){
        return studentRepository.loadAllStudentsFromFile();
    }



    public void deleteStudentById(int studentId){
        List<Student> students = studentRepository.loadAllStudentsFromFile();
        boolean removed = students.removeIf(student -> student.getStudentId()==studentId);

        if (removed){
            //cascade delete
            enrollmentService.deleteEnrollmentByStudentId(studentId);
            studentRepository.saveAllStudentsToFile(students);
            System.out.println("Student removed successfully.");
        }else {
            System.out.println("Student does not exist.");
        }



    }


    public boolean studentExists(int studentId){
        List<Student> students = studentRepository.loadAllStudentsFromFile();
        for (Student s: students){
            if (s.getStudentId()==studentId){
                return true;
            }
        }
        return false;
    }

}
