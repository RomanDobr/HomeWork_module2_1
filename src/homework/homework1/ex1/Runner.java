package homework.homework1.ex1;

import homework.homework1.ex1.zoo.Bird;
import homework.homework1.ex1.zoo.Dog;
import homework.homework1.ex1.zoo.Tiger;
import homework.homework1.ex1.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Zoo<Tiger> tigerZoo = new Zoo<>();
        tigerZoo.setAnimal(tiger);
        tigerZoo.getAnimal().growl();

        Dog dog = new Dog();
        Zoo<Dog> dogZoo = new Zoo<>();
        dogZoo.setAnimal(dog);
        dogZoo.getAnimal().bark();

        Bird bird = new Bird();
        Zoo<Bird> birdZoo = new Zoo<>();
        birdZoo.setAnimal(bird);
        birdZoo.getAnimal().fly();
    }
}
