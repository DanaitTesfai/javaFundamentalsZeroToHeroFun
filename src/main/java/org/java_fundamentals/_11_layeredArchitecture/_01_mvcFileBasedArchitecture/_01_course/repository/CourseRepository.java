package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._01_course.repository;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._01_course.model.Course;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private File courseFile = new File("courses_db.txt");


    public void saveAllCourses(List<Course> courses){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(courseFile))){
            for (Course c: courses){
                writer.write(c.getId()+","+c.getName()+","+c.getCreditHours());
                writer.newLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public List<Course> findAllCourses(){
        List<Course> courses = new ArrayList<>();
        try{
            if (!courseFile.exists()){
                courseFile.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(courseFile));
            String line;
            while ((line = reader.readLine()) != null){
                String[] lineArray = line.split(",");
                int id = Integer.parseInt(lineArray[0]);
                String name = lineArray[1];
                int creditHours = Integer.parseInt(lineArray[2]);
                Course course = new Course(id, name, creditHours);
                courses.add(course);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return courses;

    }


}
