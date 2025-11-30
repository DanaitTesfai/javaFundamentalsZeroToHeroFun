package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.controller;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Course;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Enrollment;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Student;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository.CourseRepository;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository.EnrollmentRepository;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository.StudentRepository;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.service.CourseService;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.service.EnrollmentService;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class EnrollmentController {
    private StudentService studentService ;
    private CourseService courseService ;
    private EnrollmentService enrollmentService ;
    Scanner sc = new Scanner(System.in);

    public EnrollmentController() {
        StudentRepository studentRepository = new StudentRepository();
        CourseRepository courseRepository = new CourseRepository();
        EnrollmentRepository enrollmentRepository = new EnrollmentRepository();

        enrollmentService = new EnrollmentService(enrollmentRepository ,null,null );
        studentService = new StudentService(studentRepository,enrollmentService);
        courseService = new CourseService(courseRepository, enrollmentService);

        enrollmentService = new EnrollmentService(enrollmentRepository, studentService, courseService);
    }

    public void start() {
        while (true) {
            System.out.println("===== INSTITUTE MANAGEMENT SYSTEM =====\n" +
                    "1. Add Student\n" +
                    "2. Show Students\n" +
                    "3. Delete Student\n" +
                    "4. Add Course\n" +
                    "5. Show Courses\n" +
                    "6. Delete Course\n" +
                    "7. Enroll Student to Course\n" +
                    "8. Show Enrollments\n" +
                    "9. Exit");
            System.out.print("Enter choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    addCourse();
                    break;
                case 5:
                    showCourses();
                    break;
                case 6:
                    deleteCourse();
                    break;
                case 7:
                    enrollStudent();
                    break;
                case 8:
                    showEnrollments();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");

            }

        }
    }

    private void showEnrollments() {
        List<Enrollment> enrollments = enrollmentService.getAllEnrollments();
        if (enrollments.isEmpty()){
            System.out.println("There are no enrollments to view.");
            return;
        }
        for (Enrollment e: enrollments){
            System.out.println(e);
        }


    }

    private void enrollStudent() {
        System.out.print("Enter student Id to enroll: ");
        int studentId = sc.nextInt();

        System.out.print("Enter course Id to enroll: ");
        int courseId = sc.nextInt();
        sc.nextLine();
        enrollmentService.enrollStudentInCourse(studentId,courseId);
    }

    private void deleteCourse() {
        System.out.print("Enter course Id to delete: ");
        int courseId = sc.nextInt();
        sc.nextLine();

        courseService.deleteCourseById(courseId);

    }

    private void showCourses() {
        List<Course> courses = courseService.getAllCourses();
        if (courses.isEmpty()){
            System.out.println("There are no courses to view.");
            return;
        }
        for (Course c: courses){
            System.out.println(c);
        }
    }

    private void addCourse() {
        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();

        courseService.addCourse(courseName);

    }

    private void deleteStudent() {
        System.out.println("Enter student Id: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        studentService.deleteStudentById(studentId);

    }

    private void showStudents() {
        List<Student> students = studentService.getAllStudents();
        if (students.isEmpty()){
            System.out.println("There are no students to view.");
            return;
        }
        for (Student s: students){
            System.out.println(s);
        }

    }

    private void addStudent() {
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        studentService.addStudent(studentName);

    }
}
