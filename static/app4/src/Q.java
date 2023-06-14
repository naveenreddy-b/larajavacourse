class Q
{
	static int i = test();
	static
	{
		System.out.println("SIB:" + i);
		i = 10;
	}	
	public static int test()
	{
		System.out.println("test:" + i);
		return 69;
	}
	public static void main(String[] args)
	{
		System.out.println("main begin:" + i);
		i = 33;
		System.out.println(test());
		System.out.println("main end:" + i);
	}	
}
