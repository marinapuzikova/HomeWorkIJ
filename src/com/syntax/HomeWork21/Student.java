package com.syntax.HomeWork21;

public class Student {
     /* Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism*/

    void learning(){
        System.out.println("Participating in lesson,reading a lot of materials");
    }
    void practicing(){
        System.out.println("Doing home work constantly");
    }

}
class SyntaxStudent extends Student{
    @Override
    void learning(){
        System.out.println("At Syntax students participating in lesson online,reading a lot of materials");
    }
    @Override
    void practicing(){
        System.out.println("At Syntax students practicing a lot by doing home work constantly and repls");
    }
    void sleep(){
        System.out.println("Students at Syntax don't have a chance to sleep normal hours");
    }
}
class CollegeStudent extends Student{
    @Override
    void learning(){
        System.out.println("College students participating in lesson on campus,reading a lot of materials");
    }
    @Override
    void practicing() {
        System.out.println("College students are doing home work constantly to achieve a good grades");
    }
    void discount(){
        System.out.println("College student is getting discount on public transportation");
    }
}
class SchoolStudent extends Student{
    @Override
    void learning(){
        System.out.println("School students participating in lesson in class ,reading a lot of materials");
    }
    @Override
    void practicing() {
        System.out.println("School students have to do home work constantly to get a good grades and to be able to go to College");
    }

    void hours(){
        System.out.println("School students studying at school from 8 am to 3 pm");
    }

}

