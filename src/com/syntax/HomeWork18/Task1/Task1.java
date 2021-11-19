package com.syntax.HomeWork18.Task1;

public class Task1 {

        /*
        Write program for multilevel inheritance where class A inherited by
         B(means class A is a parent class) and class B inherit class by C.
         */
        public static void main(String[] args) {
            C b = new C();
        }

}


class B extends A {
    B() {
        System.out.println("B");
    }
}

class C extends B {
    C() {
        System.out.println("C");
    }
}
class A {
    A() {
        System.out.println("A");
    }
}