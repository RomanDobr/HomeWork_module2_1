package com.javaacademy.lessons.homework.homework2.ex2;

import java.util.Objects;

public class Item {
    private String name;
    protected static int count = 0;

    public Item(String name) {
        this.name = name;
        count++;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return name;
    }
}
