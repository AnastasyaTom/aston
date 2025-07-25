package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<StudentNew> studentNewSet = new HashSet<>();
        studentNewSet.add(new StudentNew("Петров", 3, 3, 2));
        studentNewSet.add(new StudentNew("Сидоров", 5, 4, 7));
        studentNewSet.add(new StudentNew("Логунова", 1, 4, 8));
        studentNewSet.add(new StudentNew("Токарева", 3, 3, 4));

        for (StudentNew student : studentNewSet) {
            System.out.println(student);
        }
        studentNewSet.removeIf(studentNew -> studentNew.getAvMark() < 3);

        System.out.println("--------------------");
        for (StudentNew student : studentNewSet) {
            System.out.println("Студент, переведенный на следующий курс: " + student);
        }
        System.out.println("------------------------");

        int course = 3;
        for (StudentNew s : studentNewSet) {
            if (s.getCourse() == course) {
                System.out.println("курс " + s.getCourse() + ": " + s.getLastName());
            }
        }
        System.out.println("--------------------------");

        course = 4;
        for (StudentNew s : studentNewSet) {
            if (s.getCourse() == course) {
                System.out.println("курс " + s.getCourse() + ": " + s.getLastName());
            }
        }

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        HashMap<String, String> pb = new HashMap<>();
        pb.put("331542", "Vasa");
        pb.put("654545", "Rasa");
        pb.put("526978", "Sasa");
        pb.put("526974", "Lisa");
        pb.put("963258", "Kisa");

        System.out.println(pb);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        pb.put ("656565", "Lisa");
        System.out.println(pb);



    }
}

