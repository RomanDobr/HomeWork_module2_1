package homework.homework3.ex3;

/**
 *  Задание №3: Поиск пары с помощью гадания
 *  Создать функциональный гадание, который на вход принимает аргумент любого типа,
 *  на выход возвращает да/нет.
 *  Создать с помощью лямбд выражений:
 *  ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
 *  бабку гадалку: принимает Человека(возраст,рост),
 *  возвращает да - если возраст + рост больше 210, нет - если меньше или равно
 */
public class Runner {
    public static void main(String[] args) {
        Chamomile chamomile = new Chamomile("Anabel");
        Fortune<Chamomile> chamomilePredicate = chamomileA -> {
            if (chamomileA.getName().length() % 2 == 0) {
                return true;
            }
            return false;
        };

        System.out.println("В имени " + chamomile.getName() + " четное кол-во букв: "
                + (chamomilePredicate.fortune(chamomile) ? "Да" : "Нет"));

        GrandMa grandMa = new GrandMa(78, 170);
        Fortune<GrandMa> grandMaPredicate = grandMaA -> {
            if (grandMaA.getAge() + grandMaA.getHeight() > 210) {
                return true;
            }
            return false;
        };

        System.out.println("У бабки гадалки \"возраст + рост\" больше 210: "
                + (grandMaPredicate.fortune(grandMa) ? "Да" : "Нет"));
    }
}
