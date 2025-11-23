package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture.service;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture.model.Course;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture.repository.CourseRepository;

import java.util.List;

public class CourseService {
    CourseRepository courseRepository = new CourseRepository();

    public List<Course> getAllCourses() {
        List<Course> courses = courseRepository.findAllCourses();
        return courses;
    }

    public void addCourse(String name, int creditHour) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name can not be empty.");
            return;
        }
        if (creditHour < 1 || creditHour > 5) {
            System.out.println("Credit hour must be between 1 and 5.");
            return;
        }

        List<Course> courses = courseRepository.findAllCourses();
        for (Course c : courses) {
            if (c.getName().equalsIgnoreCase(name.trim())) {
                System.out.println("Course name already exists.");
                return;
            }
        }

        int nextId = courses.isEmpty() ? 1 : courses.get(courses.size() - 1).getId() + 1;
        Course newCourse = new Course(nextId, name, creditHour);
        courses.add(newCourse);
        courseRepository.saveAllCourses(courses);
        System.out.println("Course added successfully.");
    }

    public void deleteCourseById(int id) {
        List<Course> courses = courseRepository.findAllCourses();
        boolean removed = courses.removeIf(c -> c.getId() == id);

        if (removed) {
            courseRepository.saveAllCourses(courses);
            System.out.println("Course deleted successfully.");
        } else {
            System.out.println("Course with id " + id + " can not be found.");
        }
    }

    public void updateCourseById(int id, String name, int creditHour) {
        List<Course> courses = courseRepository.findAllCourses();

        Course target = null;
        for (Course c : courses) {
            if (c.getId() == id) {
                target = c;
                break;
            }
        }

        if (target == null) {
            System.out.println("Course with id " + id + " can not be found.");
            return;
        }

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name can not be empty.");
            return;
        }

        if (creditHour < 1 || creditHour > 5) {
            System.out.println("Credit hour must be between 1 and 5.");
            return;
        }

        for (Course c : courses) {
            if (c.getName().equalsIgnoreCase(name.trim())) {
                System.out.println("Course name already exists.");
                return;
            }
        }

        target.setName(name);
        target.setCreditHours(creditHour);
        courseRepository.saveAllCourses(courses);
        System.out.println("Course updated successfully.");
    }


}


