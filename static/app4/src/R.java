class R
{
	static int i = test();
	static
	{
		System.out.println("SIB:" + i);
		i = 10;
	}	

	public static void main(String[] args)
	{
		System.out.println("main:" + i);
	}

	public static int test()
	{
		System.out.println("test:" + i);
		return 69;
	}
}
