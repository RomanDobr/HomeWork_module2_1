package homework.homework1.ex1;

import homework.homework1.ex1.zoo.Bird;
import homework.homework1.ex1.zoo.Dog;
import homework.homework1.ex1.zoo.Tiger;
import homework.homework1.ex1.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Zoo<Tiger, Bird, Dog> zoo = new Zoo<>(tiger, bird, dog);
        zoo.getTiger().growl();
        zoo.getBird().fly();
        zoo.getDog().bark();
    }
}
