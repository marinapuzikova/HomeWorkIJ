package com.syntax.HomeWork26;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("cake");
        words.add("coffee");
        words.add("lemon");
        words.add("sun");
        words.add("chair");
        /*while (iterator.hasNext()){
            String  newWordsList =iterator.next();
            if(newWordsList.endsWith("e") ){
                iterator.remove();
            }
        }
        System.out.println(words);
         */
        words.removeIf(newWordsList -> newWordsList.endsWith("e"));
        System.out.println(words);
    }
}
