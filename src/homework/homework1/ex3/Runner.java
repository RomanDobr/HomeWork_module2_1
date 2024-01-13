package homework.homework1.ex3;

import homework.homework1.ex3.exception.ItemNotNameException;
import homework.homework1.ex3.exception.StockNotItemsException;
import homework.homework1.ex3.stock.Item;
import homework.homework1.ex3.stock.Stock;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args)  {
        ArrayList<Item> items = null;
        try {
            items = new ArrayList<>(List.of(
                new Item("Кукла \"Машка\""),
                new Item("Машина \"Зис\""),
                new Item("Набор \"Кубики\""),
                new Item("Лото"),
                new Item("LEGO")));
        } catch (ItemNotNameException e) {
            System.out.println(e.getMessage());
        }

        Stock magicWarehouse = new Stock();
        magicWarehouse.addItem(items);

        try {
            System.out.println("Возвращает четный список игрушек");
            for (Item evenItem : magicWarehouse.getEvenItems(magicWarehouse.getItems())) {
                System.out.println(evenItem.getName());
            }
        } catch (StockNotItemsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------");
        System.out.println("Забирам игрушку");
        Item item = magicWarehouse.getItem();
        System.out.println(item.getName());
        System.out.println("----------------------------------------------");
        for (Item itemNew : magicWarehouse.getItems()) {
            System.out.println(itemNew.getName());
        }
        System.out.println("----------------------------------------------");

        System.out.println("Удаляем все вещи, кроме последней");
        magicWarehouse.clearItemsExceptTheLastOne();
        for (Item itemNew2 : magicWarehouse.getItems()) {
            System.out.println(itemNew2.getName());
        }
        System.out.println("----------------------------------------------");

    }
}
