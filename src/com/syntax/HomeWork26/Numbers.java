package com.syntax.HomeWork26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Numbers {
    /*
    Create an arrayList of even numbers from 1 to 50.
    Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        /*for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
         */
        for (int i = 2; i <= 50; i+= 2) {//better way to write loop for this task
            numbers.add(i);
        }
        System.out.println(numbers);
        Iterator<Integer>iterator=numbers.iterator();
        while(iterator.hasNext()){
            Integer value= iterator.next();
            if(value%5==0){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}


