package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.service;


import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Course;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository.CourseRepository;

import java.util.List;

public class CourseService {
    CourseRepository courseRepository = new CourseRepository();
    EnrollmentService enrollmentService = new EnrollmentService();



    public void addCourse(String courseName){
        if (courseName == null || courseName.trim().isEmpty()){
            System.out.println("Course name can not be empty.");
            return;
        }
        List<Course> courses = courseRepository.loadAllCoursesFromFiles();
        for (Course c: courses){
            if (c.getCourseName().equalsIgnoreCase(courseName)){
                System.out.println("Course name already exists.");
                return;
            }
        }

        int newCourseId = courses.isEmpty() ? 1 : courses.get(courses.size()-1).getCourseId()+1;
        Course course = new Course(newCourseId, courseName);
        courses.add(course);
        courseRepository.saveAllCoursesToFile(courses);
        System.out.println("Course added successfully.");

    }

    public List<Course> getAllCourses(){
        return courseRepository.loadAllCoursesFromFiles();

    }

    public void deleteCourseById(int courseId){
        List<Course> courses = courseRepository.loadAllCoursesFromFiles();

        boolean removed = courses.removeIf(course -> course.getCourseId()== courseId);

        if (removed){
            //cascade delete
            enrollmentService.deleteEnrollmentByCourseId(courseId);
            courseRepository.saveAllCoursesToFile(courses);
            System.out.println("Course removed successfully.");
        }else {
            System.out.println("Course can not be found.");
        }

    }

    public boolean courseExists(int courseId){
        List<Course> courses = courseRepository.loadAllCoursesFromFiles();
        for (Course c: courses){
            if (c.getCourseId()==courseId){
                return true;
            }
        }
        return false;
    }

}


