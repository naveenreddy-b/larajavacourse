class S 
{
	int i;
	static void test(int x)
	{
		System.out.println(x);
		x = 10;
		System.out.println(x);
	}
	static void test(int x)
	{
		System.out.println(x);
		s1.i = 20;
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.i = 30;
		System.out.println("A: " + s1.i);
		//pass by reference or call by reference
		//changes in the destination doesnt reflecting back to the source

		test(s1.i);
		System.out.println("B: " + s1.i);
	}
}
