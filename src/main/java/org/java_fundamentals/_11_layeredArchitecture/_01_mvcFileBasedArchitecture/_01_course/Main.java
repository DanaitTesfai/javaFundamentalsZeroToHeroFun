package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._01_course;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._01_course.controller.CourseController;

public class Main {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();

        courseController.start();
    }
}
