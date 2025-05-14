// Main.java
public class Main {
    public static void main(String[] args) {
        AnimalFactory[] factories = { new DogFactory(), new CatFactory() };
        Animal[] animals = new Animal[factories.length];

        for (int i = 0; i < factories.length; i++) {
            animals[i] = factories[i].createAnimal();
        }

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}
