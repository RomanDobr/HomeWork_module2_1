package homework.homework4.ex1;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        Stream<Car> carStream = List.of(builderCar("а0", "ан799"), builderCar("к0", "ce178"))
                .stream()
                .flatMap(Collection::stream);

        carStream.filter(car -> (numberFilter(car.getNumber())))
                .forEach(car -> stringBuilder.append(car.getNumber()).append(", "));

        String result = stringBuilder.toString();
        System.out.println(result.substring(0, result.length() - 2));
    }

    private static List<Car> builderCar(String text1, String text2) {
        AtomicInteger counter = new AtomicInteger();
        List<Car> cars = Stream.generate(() -> new Car(text1 + counter.addAndGet(1) + text2))
                .limit(50)
                .toList();
        return cars;
    }

    private static boolean numberFilter(String string) {
        if (string.length() > 8) {
            int index = Integer.parseInt(string.substring(2, 4));
            if (index >= 40 && index < 50) {
                return true;
            }
        }
        return false;
    }

}
