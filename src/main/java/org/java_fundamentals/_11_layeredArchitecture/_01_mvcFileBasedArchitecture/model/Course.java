package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture.model;

import java.util.Objects;

public class Course {
    private int id;
    private String name;
    private int creditHours;

    public Course(int id, String name, int creditHours) {
        this.id = id;
        this.name = name;
        this.creditHours = creditHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + creditHours + " credits)";
    }
}
