class B
{
	static void test()
	{
		System.out.println(i);
		i = 100;
	}
	static int i = 10;
	public static void main(String[] args) 
	{
		System.out.println(i);
		test();
		System.out.println(i);
	}
}
