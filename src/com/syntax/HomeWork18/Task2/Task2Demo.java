package com.syntax.HomeWork18.Task2;

public class Task2Demo {

/*
Write program to inherit class A that has
	method printF which is static and call or reuse that method into class B
 */

        public static void main(String[] args) {
            B.printF();//because its static we right name of the class and call method
        }
    }

    class A{
        static void printF(){
            System.out.println("printF from A");
        }
    }
    class B extends A {

    }

