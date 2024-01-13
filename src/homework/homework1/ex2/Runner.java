package homework.homework1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(5, 2, 4));
        ArrayList<Integer> list2 = new ArrayList<Integer>(List.of(7, 10));
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        list3.remove(2);
        System.out.println(list3.indexOf(new Integer(10)));
    }
}
