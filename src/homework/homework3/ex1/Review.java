package homework.homework3.ex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.TreeSet;

public class Review {
    private int id;
    private String text;
    private int countLike;
    private LocalDateTime time;
    public static Set<Review> reviews = new TreeSet<>();

    public Review(int id, String text, int countLike, LocalDateTime time) {
        this.id = id;
        this.text = text;
        this.countLike = countLike;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = setParseTime(time);
    }

    public LocalDateTime setParseTime(String dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDateTime localTimeObj = LocalDateTime.parse(dateTime, formatter);
        return localTimeObj;
    }

    @Override
    public String toString() {
        return  id + ", " + text
                + ", " + countLike
                + ", " + time;
    }
}
