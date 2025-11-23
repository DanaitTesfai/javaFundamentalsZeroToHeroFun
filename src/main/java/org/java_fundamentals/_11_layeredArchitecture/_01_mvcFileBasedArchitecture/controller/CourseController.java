package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture.controller;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture.model.Course;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture.service.CourseService;

import java.util.List;
import java.util.Scanner;

public class CourseController {
    CourseService courseService = new CourseService();
    Scanner sc = new Scanner(System.in);

    public void start(){
        while(true){
            System.out.println("===== COURSE MENU =====\n" +
                    "1. Add Course\n" +
                    "2. Show All Courses\n" +
                    "3. Update Course\n" +
                    "4. Delete Course\n" +
                    "5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            int id, creditHours;
            String name;
            switch (choice){
                case 1:
                    System.out.print("Enter course name: ");
                    name = sc.nextLine();

                    System.out.print("Enter credit hours (1-5): ");
                    creditHours = sc.nextInt();
                    sc.nextLine();

                    courseService.addCourse(name,creditHours);
                    break;
                case 2:
                    List<Course> courses = courseService.getAllCourses();
                    courses.forEach(c -> System.out.println(c));
                    break;
                case 3:
                    System.out.print("Enter course ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter course name: ");
                    name = sc.nextLine();

                    System.out.print("Enter credit hours (1-5): ");
                    creditHours = sc.nextInt();
                    sc.nextLine();

                    courseService.updateCourseById(id,name,creditHours);
                    break;
                case 4:
                    System.out.print("Enter course ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    courseService.deleteCourseById(id);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
