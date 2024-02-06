package homework.homework4.ex2;

import java.util.*;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        Set.of("тонь", "тополь", "боль", "рой", "стройка")
                .stream()
                .map(Runner::counter)
                .reduce(Integer::sum).ifPresent(Runner::choice);
    }

    private static int counter(String str) {
        Long counter = Stream.of(str.split("")).filter("о"::equals)
                .map(String::length)
                .count();
        return counter.intValue();
    }

    private static void choice(Integer el) {
        if (el != 0) {
            System.out.println(el);
            return;
        }
        throw new RuntimeException("В списке слов, нет буквы \"о\"");
    }
}
