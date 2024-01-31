package homework.homework3.ex5;

/**
 * Задание №5: универсальная линейка
 * Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
 * Создать с помощью лямбд выражений:
 * Измеритель лодок: на вход лодка(длина), возвращает длину лодки
 * Измеритель животных: на вход животное(длина тела, длина хвоста),
 * возвращает сумму длин тела и хвоста
 */

public class Runner {
    public static void main(String[] args) {
        Boat boat = new Boat(5);
        Animal crocodile = new Animal(2, 3);

        Meter<Boat, Integer> boatrMeter = boatA -> boatA.getLength();
        Meter<Animal, Integer> crocodileMeter = animal -> animal.getLengthBody() + animal.getLengthTail();

        System.out.println("Длина лодки: " + boatrMeter.meter(boat) + "м;");
        System.out.println("Длина животного: " + crocodileMeter.meter(crocodile) + "м;");
    }
}
