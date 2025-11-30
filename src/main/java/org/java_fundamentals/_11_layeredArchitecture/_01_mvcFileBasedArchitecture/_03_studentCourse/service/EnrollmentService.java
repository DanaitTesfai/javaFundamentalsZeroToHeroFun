package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.service;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Course;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Enrollment;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Student;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository.CourseRepository;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository.EnrollmentRepository;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository.StudentRepository;

import java.util.List;

public class EnrollmentService {
    EnrollmentRepository enrollmentRepository ;
    StudentService studentService ;
    CourseService courseService ;

    public EnrollmentService(EnrollmentRepository enrollmentRepository, StudentService studentService, CourseService courseService) {
        this.enrollmentRepository = enrollmentRepository;
        this.studentService = studentService;
        this.courseService = courseService;
    }

    public void enrollStudentInCourse(int studentId, int courseId) {
        if (!studentService.studentExists(studentId)) {
            System.out.println("Student doesn't exist.");
            return;
        }
        if (!courseService.courseExists(courseId)) {
            System.out.println("Course doesn't exist.");
            return;
        }
        List<Enrollment> enrollments = enrollmentRepository.loadAllEnrollmentsFromFiles();
        for (Enrollment e : enrollments) {
            if (e.getStudentId() == studentId && e.getCourseId() == courseId) {
                System.out.println("Student already enrolled in this course.");
                return;
            }
        }

        int newEnrollmentId = enrollments.isEmpty() ? 1 : enrollments.get(enrollments.size() - 1).getEnrollmentId() + 1;

        Enrollment enrollment = new Enrollment(newEnrollmentId, studentId, courseId);
        enrollments.add(enrollment);
        enrollmentRepository.saveAllEnrollmentsToFiles(enrollments);
        System.out.println("Student enrolled successfully.");
    }


    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.loadAllEnrollmentsFromFiles();

    }


    public void deleteEnrollmentByStudentId(int studentId) {
        List<Enrollment> enrollments = enrollmentRepository.loadAllEnrollmentsFromFiles();
        boolean removed = false;
        for (int i = 0; i < enrollments.size(); i++) {
            if (enrollments.get(i).getStudentId() == studentId) {
                enrollments.remove(i);
                removed = true;
            }
        }
        if (removed) {
            enrollmentRepository.saveAllEnrollmentsToFiles(enrollments);
            System.out.println("Related enrollments removed.");
        }
    }

    public void deleteEnrollmentByCourseId(int courseId) {
        List<Enrollment> enrollments = enrollmentRepository.loadAllEnrollmentsFromFiles();
        boolean removed = false;
        for (int i = 0; i < enrollments.size(); i++) {
            if (enrollments.get(i).getCourseId() == courseId) {
                enrollments.remove(i);
                removed = true;
            }
        }
        if (removed) {
            enrollmentRepository.saveAllEnrollmentsToFiles(enrollments);
            System.out.println("Related enrollments removed.");
        }

    }

}
