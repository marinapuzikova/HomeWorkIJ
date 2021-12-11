package com.syntax.HomeWork26;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> cardList = new LinkedList<>();
        cardList.add(new Chase("Chase", 0.18, 3000));
        cardList.add(new City("City", 0.19, 2500));
        cardList.add(new Discover("Discover", 0.15, 1000));
        System.out.println("For loop");
        for (int i = 0; i < cardList.size(); i++) {
            cardList.get(i).balance();
            cardList.get(i).aprFee();
        }

        System.out.println("Advanced loop");
        for (Card cards : cardList) {
            cards.balance();
            cards.aprFee();
        }
        System.out.println("Iterator");
        Iterator<Card> iterator = cardList.iterator();
        while (iterator.hasNext()) {
            Card cardList1 = iterator.next();
            cardList1.balance();
            cardList1.aprFee();
        }
    }
}
