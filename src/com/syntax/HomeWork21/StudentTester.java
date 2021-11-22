package com.syntax.HomeWork21;

public class StudentTester {
    public static void main(String[] args) {

        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student student:students
        ) {
            student.learning();
            student.practicing();
        }

        Student synStudent = new SyntaxStudent();
        SyntaxStudent syntax = (SyntaxStudent) synStudent;
        syntax.sleep();

        Student college = new CollegeStudent();
        CollegeStudent colStudent= (CollegeStudent) college;
        colStudent.discount();

        Student school = new SchoolStudent();
        SchoolStudent schoolStudent = (SchoolStudent) school;
        schoolStudent.hours();

    }
}

