package org.java_fundamentals._08_exceptions._02_projects;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) throws InvalidInputException {
        if (students.contains(student)) {
            throw new InvalidInputException("Student already exists.");
        } else {
            students.add(student);
            return true;
        }

    }


    public Student findById(String studentId) throws UserNotFoundException {
        for (Student s : students) {
            if (s != null && s.getStudentId().equalsIgnoreCase(studentId)) {
                return s;
            }
        }
        throw new UserNotFoundException("User not found,");
    }


    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("There are no registered students.");
            return;
        }
        for (Student s : students) {
            s.displayInfo();
        }
    }


    public void completeCourse(String studentId){
        try{
            Student s = findById(studentId);
            if (s.getStatus().equalsIgnoreCase("Completed")){
                System.out.println("Course already completed.");
                return;
            }
            s.setStatus("Completed");
            System.out.println("Final fee for " +s.getName() + ": $" + String.format("%.2f",s.calculateFee()));
            System.out.println("Course marked as completed");

        } catch (UserNotFoundException | InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
