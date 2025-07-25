package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class StudentNew {
    private String lastName;
    private int group;
    private int course;
    private int avMark;

    public StudentNew(String lastName, int group, int course, int avMark) {
        this.lastName = lastName;
        this.group = group;
        this.course = course;
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
        return  "Фамилия: " + lastName +
                ", группа " + group +
                ", курс " + course +
                ", ср.балл " + avMark;
    }
    public static void setStudent (Student [] args) {
        HashSet<StudentNew> studentNewSet = new HashSet<>();

        for (StudentNew student : studentNewSet) {
            System.out.println(student);
        }
        studentNewSet.removeIf(studentNew -> studentNew.getAvMark() < 3);

        for (StudentNew student : studentNewSet){
            System.out.println("Студент, переведенный на следующий курс: " + student);
        }
    }

    public static void printStudents(HashSet<StudentNew> studentNewSet, int course){

        for (StudentNew s : studentNewSet) {
            if (s.getCourse() == course) {
                System.out.println("курс " + s.getCourse() + ": " + s.getLastName());
            }
        }
    }
}

