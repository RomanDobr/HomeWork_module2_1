package com.javaacademy.lessons.homework.homework2.ex1.airport;

import java.util.Queue;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwLuggageScreaming(Queue<Suitcase> suitcases) {
        if (suitcases.isEmpty()) {
            throw new RuntimeException("Пустое багажное отделение");
        }
        Suitcase suitcase = suitcases.poll();
        System.out.printf("{%s}: Мужики, кидаю чемодан {%s №", name, suitcase.getNumberFlight());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
