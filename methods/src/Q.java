class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		test();
		System.out.println("main end");
	}
	static double test()
	{
		System.out.println("from test");
		return 10;//up casting to double
	}
}
// byte < short < int < long < float < double
// char and boolean