package com.syntax.HomeWork26;

import java.util.HashSet;
import java.util.Set;

public class StudentTester {
    public static void main(String[] args) {


        Set<Student> student = new HashSet<>();
        student.add(new Student("Alexey","123"));
        student.add(new Student("Sorbon","223"));
        student.add(new Student("Aysha","323"));
        student.add(new Student("Sebastian","12345"));
        for(Student students:student){
            students.printName();
        }
    }
}
