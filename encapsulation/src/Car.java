class Car 
{
	private String make;
	private String model;
	private int year;
}
class CarDriver
{
	public static void main(String[] args) 
	{
		Car car = new Car();
		car.setMake("Toyota");
		car.setModel("Camry");
		car.seYear("2020");
		String make = car.getMake();
		String model = car.getModel();
		int year = car.getYear();
		System.out.println("Make:" + make);
		System.out.println("Model:" + model);
		System.out.println("Year:" + year);
	}
}
