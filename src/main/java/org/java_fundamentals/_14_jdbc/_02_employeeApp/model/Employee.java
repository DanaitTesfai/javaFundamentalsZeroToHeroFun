package org.java_fundamentals._14_jdbc._02_employeeApp.model;

import java.time.LocalDateTime;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private int departmentId;
    private LocalDateTime createdAt;

    public Employee() {
    }

    public Employee(int id, String fullName, String email, int departmentId, LocalDateTime createdAt) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.departmentId = departmentId;
        this.createdAt = createdAt;
    }

    public Employee(String fullName, String email, int departmentId, LocalDateTime createdAt) {
        this.fullName = fullName;
        this.email = email;
        this.departmentId = departmentId;
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", departmentId=" + departmentId +
                ", createdAt=" + createdAt.toString() +
                '}';
    }
}
