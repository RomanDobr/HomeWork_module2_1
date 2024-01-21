package com.javaacademy.lessons.homework.homework2.ex2;

import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {
        Map<Item, Integer> vegetables = new HashMap<>();
        Item apple = new Item("Яблоко");
        Item banana = new Item("Банан");
        Item orange = new Item("Апельсин");

        vegetables.put(apple, 1);
        vegetables.put(banana, 2);
        vegetables.put(orange, 3);

        for (Map.Entry<Item, Integer> pairs : vegetables.entrySet()) {
            System.out.println(pairs.getKey() + "-" + pairs.getValue());
        }
    }
}
