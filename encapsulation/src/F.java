class Employee {
    private String name;
    private double salary;
}

    // Getters and setters for name and salary
    // ...
	public String setName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double setSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
public class EmpolyeeApp
	{

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setSalary(50000.0);
        String name = employee.getName();
        double salary = employee.getSalary();
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}