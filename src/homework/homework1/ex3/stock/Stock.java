package homework.homework1.ex3.stock;

import homework.homework1.ex3.exception.StockNotItemsException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
    private ArrayList<Item> items;

    public Stock() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(ArrayList<Item> newItems) {
        ArrayList<Item> itemsTmp = new ArrayList<>();
        itemsTmp.addAll(newItems);
        items.addAll(itemsTmp);
    }

    public ArrayList<Item> getEvenItems(ArrayList<Item> items) throws StockNotItemsException {

        ArrayList<Item> itemsTmp = new ArrayList<>();
        if (items.size() != 0) {
            int j = 0;
            for (int i = 1; i <= items.size(); i++) {
                if (i % 2 == 0) {
                    itemsTmp.add(j, items.get(i));
                    j++;
                }
            }
            return itemsTmp;
        }
        throw new StockNotItemsException("На складе нет игрушек!!!");
    }

    public Item getItem() {
        System.out.println("На складе " + items.size() + " вещей");
        for (int i = 1; i <= items.size(); i++) {
            System.out.println("Индекс: " + i + " - " + items.get(i - 1).getName() + ";");
        }
        System.out.println("Введите индекс вещи для того чтобы забрать со склада");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int index = scanner.nextInt();
        Item item = items.get(index - 1);
        items.remove(index - 1);
        scanner.close();
        return item;
    }

    public Item getItem(int index) {
        Item item = items.get(index - 1);
        items.remove(index - 1);
        return item;
    }

    public void clearItemsExceptTheLastOne() {
        for (int i = 0; i <= items.size(); i++) {
            items.remove(0);
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
