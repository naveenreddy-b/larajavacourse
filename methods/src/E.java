class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		test();
		test();
		System.out.println("main end");
		test();
	}
	public static void test()
	{
		System.out.println("from test1");
		System.out.println("from test1");
		System.out.println("from test1");
	}
}
