package com.javaacademy.lessons.homework.homework2.ex3;

import java.util.Objects;

public class Detail {
    private String name;

    public Detail(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
