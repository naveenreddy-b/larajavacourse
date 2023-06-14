class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class Main8 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        System.out.println(car.getMake() + " " + car.getModel() + " " + car.getYear());
    }
}
