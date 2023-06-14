class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void startEngine() {
        engine.start();
    }
}

public class Main18 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
    }
}