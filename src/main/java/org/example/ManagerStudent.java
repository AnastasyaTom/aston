package org.example;
import java.util.Set;

public class ManagerStudent extends Student{

    public ManagerStudent(String lastName, int group, int course, int avMark) {
        super(lastName, group, course, avMark);
    }

    public static void setStudentRemove (Set <Student> studentSet) {
        studentSet.removeIf(student -> student.getAvMark() < 3);
    }

    public static void setStudentPromote (Set <Student> studentSet) {
        for (Student student : studentSet) {
            if (student.getAvMark() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> studentSet, int course){
        System.out.println("Студенты на курсе "+ course + ": ");
        for (Student student : studentSet) {
            if (student.getCourse() == course) {
                System.out.println(student.getLastName());

            }
        }
    }

}
