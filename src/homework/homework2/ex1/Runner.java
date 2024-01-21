package com.javaacademy.lessons.homework.homework2.ex1;

import com.javaacademy.lessons.homework.homework2.ex1.airport.LuggageRoom;
import com.javaacademy.lessons.homework.homework2.ex1.airport.Worker;


public class Runner {
    public static void main(String[] args) {
        LuggageRoom luggageRoom = new LuggageRoom();
        luggageRoom.planeArrival("SU-077");
        luggageRoom.planeArrival("AO-222");
        luggageRoom.getWorkers().add(new Worker("Вован"));
        luggageRoom.getWorkers().add(new Worker("Толян"));
        luggageRoom.getWorkers().add(new Worker("Колян"));
        luggageRoom.unloadLugages(luggageRoom.getWorkers());

    }

}
