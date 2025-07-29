package org.example;

import java.util.HashSet;

public class Student {
    private String lastName;
    private int group;
    private int course;
    private int avMark;

    public Student(String lastName, int group, int course, int avMark) {
        this.lastName = lastName;
        this.group = group;
        this.course = course;
        this.avMark = avMark;
    }

    public static void setStudentPromote(HashSet<Student> studentSet) {

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvMark(int avMark) {
        this.avMark = avMark;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public int getAvMark() {
        return avMark;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return  "Фамилия: " + getLastName() +
                ", группа - " + getGroup() +
                ", курс " + getCourse() +
                ", ср.балл " + getAvMark();
    }

}

