package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.repository;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._03_studentCourse.model.Enrollment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepository {
    File enrollmentFile = new File("enrollments_db.txt");

    public void saveAllEnrollmentsToFiles(List<Enrollment> enrollments){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(enrollmentFile))){
            for (Enrollment e: enrollments){
                writer.write(e.getEnrollmentId() + "," + e.getStudentId() + "," + e.getCourseId());
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }



    public List<Enrollment> loadAllEnrollmentsFromFiles(){
        List<Enrollment> enrollments = new ArrayList<>();
        try{
            if (!enrollmentFile.exists()){
                enrollmentFile.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(enrollmentFile));

            String line;
            while ((line = reader.readLine()) != null){
                String[] lineArray = line.split(",");
                int enrollmentId = Integer.parseInt(lineArray[0]);
                int studentId = Integer.parseInt(lineArray[1]);
                int courseId = Integer.parseInt(lineArray[2]);

                Enrollment enrollment = new Enrollment(enrollmentId,studentId,courseId);
                enrollments.add(enrollment);

            }
            reader.close();

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return enrollments;

    }
}
