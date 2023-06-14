class A 
{
	static int i;

	static 
	{
		System.out.println("A.SIB");
	}

	static void test()
	{
		System.out.println("A.test()");
	}
}
class Z1
{
	static
	{
		System.out.println("Z1.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Z1.main begin");
		A.test();
		System.out.println("----------");
		System.out.println(A.i);
		System.out.println("----------");
		A.test();
		System.out.println(A.i);
		System.out.println("----------");
		A.test();
		System.out.println("Z.main end");
	}
}
