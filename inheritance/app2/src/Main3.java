class Monitor {
    private String brand;
    private int sizeInInches;

    public Monitor(String brand, int sizeInInches) {
        this.brand = brand;
        this.sizeInInches = sizeInInches;
    }

    public String getMonitorInfo() {
        return brand + " (" + sizeInInches + " inches)";
    }
}

class Computer {
    private String brand;
    private Monitor monitor; // Composition

    public Computer(String brand, Monitor monitor) {
        this.brand = brand;
        this.monitor = monitor;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Monitor: " + monitor.getMonitorInfo());
    }
}

public class Main3 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 24);
        Computer computer = new Computer("Dell", monitor);
        computer.displayInfo();
    }
}