package homework.homework1.ex1.zoo;

public class Zoo<T extends Animal> {
    private T animal;

    public void setAnimal(T animal) {
        System.out.println("Животное " + animal.getClass().getSimpleName() + " добавлено в зоопарк");
        this.animal = animal;
    }

    public T getAnimal() {
        if (animal != null) {
            T t = animal;
            animal = null;
            return t;
        }
        throw new RuntimeException("Нет животного в зоопарке");
    }
}
