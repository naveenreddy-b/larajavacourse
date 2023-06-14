// Parent class
class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

// Child class
class Car {
    private Engine engine; // Composition

    public Car() {
        this.engine = new Engine();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}