package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Student", 4, 8.8);
        Student st2 = new Student("Student1", 2, 3.8);
        Student st3 = new Student("Student2", 5, 9.8);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало getStudents");
        System.out.println(students.get(3));
        System.out.println(students);
        return students;
    }
}
