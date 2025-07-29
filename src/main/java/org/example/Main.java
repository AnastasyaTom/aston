package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Петров", 3, 3, 2));
        studentSet.add(new Student("Сидоров", 5, 4, 7));
        studentSet.add(new Student("Логунова", 1, 4, 8));
        studentSet.add(new Student("Токарева", 3, 3, 4));

        System.out.println("Список студентов:");
       // studentSet.forEach(System.out::println);
        for (Student student : studentSet) {
            System.out.println(student);
        }
        studentSet.removeIf(student -> student.getAvMark() < 3);

        Student.setStudentPromote (studentSet);
        for (Student student : studentSet) {
            System.out.println("Студент, переведенный на следующий курс: " + student);
        }
        System.out.println("------------------------");

        int course = 3;
        for (Student s : studentSet) {
            if (s.getCourse() == course) {
                System.out.println("курс " + s.getCourse() + ": " + s.getLastName());
            }
        }
        System.out.println("--------------------------");

        course = 4;
        for (Student s : studentSet) {
            if (s.getCourse() == course) {
                System.out.println("курс " + s.getCourse() + ": " + s.getLastName());
            }
        }

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        PhoneBook pb = new PhoneBook();
        pb.add("Сидоров", "778800");
        pb.add("Петров", "552336");
        pb.add("Токарева", "663324");
        pb.add("Логинов", "665481");
        pb.add("Петров", "654789");

        System.out.println(pb);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println("Петров" + pb.get("Петров"));



    }
}

