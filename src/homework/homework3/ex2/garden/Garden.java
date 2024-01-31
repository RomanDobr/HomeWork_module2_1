package homework.homework3.ex2.garden;

@FunctionalInterface
public interface Garden<T extends Fruit> {
    T grow();
}
