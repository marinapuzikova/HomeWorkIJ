package com.syntax.HomeWork26;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        //TODO just an example how to create TODO list
        ArrayList<Insurance> insurance = new ArrayList<>();
        insurance.add(new Car("Progressive", "Lexus IS"));
        insurance.add(new Pet("Spot", "Cat"));
        insurance.add(new Health("Fidelis"));
        System.out.println("For loop");
        for (int i = 0; i < insurance.size(); i++) {
            insurance.get(i).getQuote();
            insurance.get(i).cancelInsurance();
        }

        System.out.println("Advanced loop");
        for (Insurance insurances:insurance) {
            insurances.getQuote();
            insurances.cancelInsurance();
        }
        System.out.println("Iterator");
        Iterator<Insurance> iterator = insurance.iterator();
        while( iterator.hasNext()){
            Insurance insurance1= iterator.next();
            insurance1.getQuote();
            insurance1.cancelInsurance();
        }
    }
}
