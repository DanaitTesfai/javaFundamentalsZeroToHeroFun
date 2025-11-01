package org.java_fundamentals._08_exceptions._02_projects;

import java.util.Objects;

abstract public class Student implements Displayable, Billable {
    private String studentId;
    private String name;
    private int age;
    private int courseDuration;
    private String status;

    public Student(String studentId, String name, int age, int courseDuration, String status) throws InvalidInputException{
        setStudentId(studentId);
        setName(name);
        setAge(age);
        setCourseDuration(courseDuration);
        setStatus(status==null || status.isBlank() ? "Active" : status);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) throws InvalidInputException {
        if (studentId != null && !studentId.isBlank()){
            this.studentId = studentId;
        }else {
            throw new InvalidInputException("Student Id cannot be blank.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidInputException{
        if (name != null && !name.isBlank()){
            this.name = name;
        }else {
            throw new InvalidInputException("Name cannot be blank.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidInputException {
        if (age >= 18){
            this.age = age;
        }else {
            throw new InvalidInputException("Age must be greater than 18.");
        }
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) throws InvalidInputException {
        if (courseDuration > 0){
            this.courseDuration = courseDuration;
        }else {
            throw new InvalidInputException("Course duration must be positive.");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws InvalidInputException{
        if (status == null || status.isBlank())
            throw new InvalidInputException("Status cannot be blank.");

        String s = status.trim();
        if (!s.equalsIgnoreCase("Active") && !s.equalsIgnoreCase("Completed"))
            throw new InvalidInputException("Status must be Active or Completed.");
        this.status = s;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId);
    }

    public abstract double calculateFee();

    @Override
    public void displayInfo() {
        System.out.println("Student Id: " + studentId + ", Name: " + name + ", Age: " + age + ", Duration: " + courseDuration + ",Status: " + status);
    }
}
