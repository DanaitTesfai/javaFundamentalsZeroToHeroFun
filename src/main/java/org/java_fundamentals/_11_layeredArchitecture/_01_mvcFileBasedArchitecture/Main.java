package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture.controller.CourseController;

public class Main {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();

        courseController.start();
    }
}
