package com.javaacademy.lessons.homework.homework2.ex3;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<Detail, Integer> map = new HashMap<>();
        Detail saw = new Detail("Пила");
        Detail hammer = new Detail("Молоток");
        Detail screwdriver = new Detail("Отвертка");
        map.put(saw, Integer.valueOf(1));
        map.put(hammer, Integer.valueOf(2));
        map.put(screwdriver, Integer.valueOf(3));
        for (Map.Entry<Detail, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey().getName() + " - " + pair.getValue().toString());
        }


    }
}
