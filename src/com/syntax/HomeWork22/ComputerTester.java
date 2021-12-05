package com.syntax.HomeWork22;

public class ComputerTester {
    public static void main(String[] args) {

                            //creating objects of classes
        Computer[] computers = {new Apple("Apple", 2000), new Lenovo("Lenovo", 1500), new Dell("Dell", 1100), new HP("HP", 1300)};


        for (Computer computer : computers) {
            computer.getPrice();
            computer.getName();
            if (computer instanceof Apple) {
                ((Apple) computer).getAppleUrl();
            } else if (computer instanceof Lenovo) {
                ((Lenovo) computer).foldable();
            } else if (computer instanceof Dell) {
                ((Dell) computer).ram();
            } else if (computer instanceof HP) {
                ((HP) computer).getModel();
            }
        }
    }
}
