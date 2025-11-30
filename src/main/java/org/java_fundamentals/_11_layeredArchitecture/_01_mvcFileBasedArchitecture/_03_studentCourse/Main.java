package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.controller.EnrollmentController;

public class Main {
    public static void main(String[] args) {
        EnrollmentController enrollmentController = new EnrollmentController();

        enrollmentController.start();

    }
}
