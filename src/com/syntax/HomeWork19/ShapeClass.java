package com.syntax.HomeWork19;

public class ShapeClass {
    /*
       Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
       In circle class create a method to calculate the area of circle. Test your code
        */
    double radius;

    ShapeClass(double radius) {
        this.radius = radius;
    }
}

class CircleClass extends ShapeClass {
    double PI = 3.14;

    CircleClass(double radius) {
        super(radius);
    }

    void calculate() {

        double area = super.radius * super.radius * PI;
        System.out.println("The area of our circle with radius: " + radius + " is " + area);
    }
}
