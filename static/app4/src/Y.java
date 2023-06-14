class A 
{
	static int i;
	static  
	{
		int i = 10;
		System.out.println("A.SIB:" + i);
		System.out.println("A.SIB:" + A.i);
		i = 20;
		A.i = 200;
	}
}
class Y
{
	static
	{
		System.out.println("X.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		A.i = 300;
		System.out.println("---------------");
		System.out.println(A.i);
		A.i += 300;
		System.out.println("---------------");
		System.out.println(A.i);
		System.out.println("main end");
	}
}
