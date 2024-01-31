package homework.homework3.ex2;

import homework.homework3.ex2.garden.Apple;
import homework.homework3.ex2.garden.Apricot;
import homework.homework3.ex2.garden.Garden;

/**
 * Задание №2: Сад
 * Создать два фрукта: яблоко, абрикос. (Без полей)
 * Создать функциональный интерфейс сад, который умеет выращивать фрукты.
 * Метод ничего не принимает.
 * Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
 * Яблочная ферма должна отдавать яблоки(не фрукты!), абрикосовая абрикосы(не фрукты!).
 */

public class Runner {
    public static void main(String[] args) {
        Garden<Apple> appleFarm = () -> {
            System.out.println("Вырастили яблоко");
            return new Apple();
        };

        Garden<Apricot> apricotFarm = () -> {
            System.out.println("Вырастили абрикос");
            return new Apricot();
        };

        Apple apple = appleFarm.grow();
        Apricot apricot = apricotFarm.grow();
    }
}
