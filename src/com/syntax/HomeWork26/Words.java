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
        // This operation might change the size of original list its not a good idea to use loops without Iterator
        Iterator<String>iterator=words.iterator();
        while (iterator.hasNext()){
            String  newWordsList =iterator.next();
            if(newWordsList.toLowerCase().endsWith("e") ){
                iterator.remove();
            }
        }
        System.out.println(words);

        words.removeIf(newWordsList -> newWordsList.endsWith("e"));//same method but using lambda
        System.out.println(words);
    }
}
