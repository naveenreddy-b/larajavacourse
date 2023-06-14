class Student1 
{
	int roll_number;
	String name;
	String college_name;
	String course;
	Student(int roll_number,String name,String course)
	{
		this.roll_number = roll_number;
		this.name = name;
	}
	{
		this.college_name = "Lara";
}
	{
		this.course = "Java";
}
	public static void main(String[] args) 
	{
		Student s1 = new Student(101, "Ashish");
		System.out.println("---------");
		Student s2 = new Student(102, "chathu");
		System.out.println("---------");
		Student s3 = new Student(103, "naveen");
		System.out.println("---------");
		Student s4 = new Student(104, "Aditya");
		System.out.println("---------");
		System.out.println(s1.roll_number + "," + s1.name + "," + s1.college_name + "," + s1.course);
		System.out.println(s2.roll_number + "," + s2.name + "," + s2.college_name + "," + S2.course);
		System.out.println(s3.roll_number + "," + s3.name + "," + s3.college_name + "," + S3.course);
	}
}
