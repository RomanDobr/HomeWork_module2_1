package homework.homework3.ex4;

import static homework.homework3.ex4.Fuel.TREE;
import static homework.homework3.ex4.Fuel.URAN;

/**
 * Задание №4: Гори ясно!
 * Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
 * любого типа.
 * Создать с помощью лямбд выражений:
 * атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
 * костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
 */
public class Runner {
    public static void main(String[] args) {

        Burning<Fuel> atomicReactorBurning = fuel -> {
            System.out.println("зеленый свет вокруг!");
        };

        Burning<Fuel> bonfireBurning = fuel -> {
            System.out.println("желто-красный свет вокруг!");
        };

        atomicReactorBurning.burning(URAN);
        bonfireBurning.burning(TREE);
    }
}
