class Vehicle {
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

public class Main19 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
    }
}
