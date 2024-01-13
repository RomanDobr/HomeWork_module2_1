package homework.homework1.ex3.stock;

import homework.homework1.ex3.exception.ItemNotNameException;

public class Item  {
    private String name;

    public Item(String name) throws ItemNotNameException {
        if ((name == null) || (name.equals(" "))) {
            throw new ItemNotNameException("Такой вещи не существует");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
