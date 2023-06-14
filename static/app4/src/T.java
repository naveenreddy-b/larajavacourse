class T
{
	static int i = test();
	
	static 
	{
		System.out.println("SIB:" + i);
		i = 99;
		main(null);
		System.out.println("SIBagain:" + i);		
		i = 10;
	}

	public static int test()
	{
		System.out.println("test:" + i);
		i = 43;
		main(null);
		System.out.println("testagain:" + i);		
		return 75;
	}

	public static void main(String[] args)
	{
		System.out.println("main:" + i);
		i = 33;
	}
}
