class A
{
	static void test()
	{
		System.out.println("from A.test");
	}
}
class Q2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A.test();
		System.out.println("main end");
	}
}