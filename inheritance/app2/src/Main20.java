class Animal {
    public void move() {
        System.out.println("Animal is moving");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main20 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.move();
        animal.bark();
    }
}