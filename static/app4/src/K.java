class K
{
	static int x = test();
	static int y = 10;
	static int test()
	{
		return y;
	}
	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);
	}
}
