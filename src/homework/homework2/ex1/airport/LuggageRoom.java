package com.javaacademy.lessons.homework.homework2.ex1.airport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LuggageRoom {
    private static final int QUANTITY = 20;
    private Queue<Suitcase> suitcases = new LinkedList<>();
    private List<Worker> workers = new ArrayList<>(3);

    public void planeArrival(String numberFlight) {
        for (int i = 0; i < QUANTITY; i++) {
            suitcases.add(new Suitcase(numberFlight));
        }
    }

    public void unloadLugages(List<Worker> workers) {
        int z = 0;
        int size = suitcases.size();
        for (int i = 0; i < workers.size(); i++) {
            for (int j = 0; j < (size / 3); j++) {
                workers.get(i).throwLuggageScreaming(suitcases);
                z++;
                System.out.print(z + "}\n");
            }
        }
        workers.get(2).throwLuggageScreaming(suitcases);
        System.out.print(++z + "}\n");
    }

    public List<Worker> getWorkers() {
        return workers;
    }
}
