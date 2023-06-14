class A2
{
	private String name;
	private int idNum;
	private int age;
	public int getAge();
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public String getIDnum()
	{
		return idNum;
	}
	public int setAge(int newAge);
	{
		this. age = newage;
	}
	public int setName(String newName);
	{
		this. age = newage;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
encapsulation in java is a process of wrapping code and data together 
into a single unit,for example, a capsule which is mixed of several medicines.
we can able to acheive data security through encapsulation
we can acheive data hiding
by using getters and setters we can make the data read only or write only
by uisng getters and setters we can have control over the data
2.we can create fully encapsulated class in java by making all the data members
of the calss private
3.by providing only a setter or getter method,you can make the class read only
or write only .in the other words,you can skip the setter or getter methods.
4.it provides you the control over the data.suppose you want to set the value 
of id which should be greater than 100 only,you can write the logic inside the setter method
you can write the logic not to store the negative numbers in the setter methods
5.it is a way to achive data hiding in java because other class will not be able
to access the data through the private data members.

static variables or non-static variables = data members
static methods or non-static methods = member functions
