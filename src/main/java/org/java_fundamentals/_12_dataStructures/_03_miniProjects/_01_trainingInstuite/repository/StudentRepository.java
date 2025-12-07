package org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.repository;

import org.java_fundamentals._12_dataStructures._03_miniProjects._01_trainingInstuite.model.Student;

import java.util.List;

public interface StudentRepository {
    public void save(Student student)throws Exception;

    public List<Student> findAll()throws Exception;
}
