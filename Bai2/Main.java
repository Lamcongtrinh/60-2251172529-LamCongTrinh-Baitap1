public class Main {
    public static void main(String[] args) {
        // Tạo một mảng kiểu Animal chứa một đối tượng Dog và một đối tượng Cat
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        // Duyệt qua mảng và in âm thanh của từng con vật
        for (Animal animal : animals) {
            System.out.println("Am thanh cua con vat la: " + animal.makeSound());
        }
    }
}
