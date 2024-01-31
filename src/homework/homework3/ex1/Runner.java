package homework.homework3.ex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Задание №1: сортировка отзывов
 * Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
 * дата + время отзыва (LocalDateTime)
 * Создать коллекцию, которая хранит отсортированные отзывы по лайкам и дата + время отзыва.
 * Уникальность определяется на основе сортировки.
 * Создать comparator через лямбда выражение, для сортировки отзывов:
 * сначала у кого больше лайков, если лайки совпадают, то сначала идут более новые отзывы
 */

public class Runner {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        Review review1 = new Review(1, "отличный товар", 200, LocalDateTime.parse("25.01.2024 13:37", formatter));
        Review review2 = new Review(2, "так себе товар", 100, LocalDateTime.parse("25.01.2024 16:37", formatter));
        Review review3 = new Review(3, "плохой товар", 100, LocalDateTime.parse("25.01.2024 13:37", formatter));
        Review review4 = new Review(4, "отличный товар", 200, LocalDateTime.parse("25.01.2024 15:37", formatter));

        Comparator<Review> comparatorByLikeTime = (reviewA, reviewB) -> {
            int vol1 = reviewA.getCountLike();
            int vol2 = reviewB.getCountLike();
            LocalDateTime ldt1 = reviewA.getTime();
            LocalDateTime ldt2 = reviewB.getTime();
            if ((vol1 - vol2) < 0) {
                return 1;
            } else if ((vol1 - vol2) > 0) {
                return -1;
            } else if (vol1 == vol2) {
                if (ldt1.compareTo(ldt2) < 0) {
                    return 1;
                } else if (ldt1.compareTo(ldt2) > 0) {
                    return -1;
                }
                return 0;
            }
            return 0;
        };

        TreeSet<Review> reviewsTmp = new TreeSet<>(comparatorByLikeTime);
        reviewsTmp.add(review1);
        reviewsTmp.add(review2);
        reviewsTmp.add(review3);
        reviewsTmp.add(review4);

        Review.reviews = reviewsTmp;

        int i = 1;
        for (Review review : Review.reviews) {
            System.out.println("отзыв №" + i + ": " + review);
            i++;
        }
    }
}
