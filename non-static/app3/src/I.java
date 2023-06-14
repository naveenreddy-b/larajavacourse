class I
{
	I()
	{
		System.out.println("I()");
	}
	{
		System.out.println("IIB1");
	}
	static
	{
		System.out.println("SIB");
	}
	public static void main(String[] args) 
	{
		I obj1 = new I();
		System.out.println("-------");
		I obj2 = new I();
		System.out.println("-------");
		I obj3 = new I();
		System.out.println("-------");
	}
}
