package homework.homework1.ex1.zoo;

public class Zoo<T extends Animal, B extends Animal,  D extends Animal> {
    private T tiger;
    private B bird;
    private D dog;

    public Zoo(T tiger, B bird, D dog) {
        this.tiger = tiger;
        this.bird = bird;
        this.dog = dog;
    }

    public void setTiger(T tiger) {
        checkAnimalNotNull(tiger);
        this.tiger = tiger;
        System.out.println(tiger.getClass().getSimpleName() + " добавлен в зоопарк");
    }

    public void setBird(B bird) {
        checkAnimalNotNull(bird);
        this.bird = bird;
        System.out.println(tiger.getClass().getSimpleName() + " добавлен в зоопарк");
    }

    public void setDog(D dog) {
        checkAnimalNotNull(dog);
        this.dog = dog;
        System.out.println(tiger.getClass().getSimpleName() + " добавлен в зоопарк");
    }

    public T getTiger() {
        checkAnimalOnNull(tiger);
        T copyT = tiger;
        tiger = null;
        return copyT;
    }

    public B getBird() {
        checkAnimalOnNull(bird);
        B copyB = bird;
        bird = null;
        return copyB;
    }

    public D getDog() {
        checkAnimalOnNull(dog);
        D copyD = dog;
        dog = null;
        return copyD;
    }

    public void checkAnimalOnNull(Animal animal) {
        if (animal == null) {
            throw new RuntimeException("Нет животного в зоопарке");
        }
    }

    public void checkAnimalNotNull(Animal animal) {
        if (animal != null) {
            throw new RuntimeException("Животное уже в зоопарке");
        }
    }
}
