class P
{
	static int i = test();
	static
	{
		System.out.println("P.SIB");
	}	
	
	public static int test()
	{
		System.out.println("test");
		return 69;
	}

	public static void main(String[] args)
	{
		System.out.println("P.main:" + i);
	}
}
