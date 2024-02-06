package homework.homework4.ex3;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<SkyTower> skyTowers = List.of(
                new SkyTower("Всемирный торговый центр 1", 541),
                new SkyTower("Шанхайская башня", 632),
                new SkyTower("Бурдж-Халифа", 828),
                new SkyTower("Международный финансовый центр Пинань", 599),
                new SkyTower("Абрадж аль-Бейт", 601),
                new SkyTower("Всемирный центр Лотте", 555),
                new SkyTower("Бурдж-Халифа", 828));

        List<SkyTower> listSkyTowers = skyTowers.stream().distinct().toList();
        listSkyTowers.stream().limit(3).forEach((el) -> System.out.println(el.toString()));
        System.out.println("---------------------------------------------------");
        listSkyTowers.stream()
                .sorted((el1, el2) -> (el2.getHeight() - el1.getHeight()))
                .limit(1)
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------");
        boolean match = listSkyTowers.stream()
                .filter(Runner::filter)
                .allMatch(el1 -> el1.getHeight() > 1000);

        if (match) {
            System.out.println("небоскреба выше километра - нет");
        }
    }

    private static boolean filter(SkyTower skyTower) {
        if (skyTower.getHeight() > 1000) {
            System.out.println(skyTower);
            return true;
        }
        return false;
    }
}
