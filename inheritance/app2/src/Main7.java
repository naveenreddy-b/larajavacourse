class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main7 {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30);
        System.out.println(employee.getAge());
    }
}