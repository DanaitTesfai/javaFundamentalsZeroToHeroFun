package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository;



import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Course;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    File courseFile = new File("courses_db.txt");

    public void saveAllCoursesToFile(List<Course> courses){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(courseFile))){
            for (Course c: courses){
                writer.write(c.getCourseId() + "," + c.getCourseName());
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


    public List<Course> loadAllCoursesFromFiles(){
        List<Course> courses = new ArrayList<>();
        try{
            if (!courseFile.exists()){
                courseFile.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(courseFile));

            String line;
            while ((line = reader.readLine()) != null){
                String[] lineArray = line.split(",");
                int courseId = Integer.parseInt(lineArray[0]);
                String courseName = lineArray[1];

                Course course = new Course(courseId, courseName);
                courses.add(course);
            }
            reader.close();
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return courses;
    }
}
