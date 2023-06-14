class A 
{
	static int i = 10;
	static  
	{
		System.out.println("A.SIB:" + i);
		i = 20;
	}
}
class X
{
	static
	{
		System.out.println("X.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("---------------");
		System.out.println(A.i);
		System.out.println("---------------");
		System.out.println("main end");
	}
}
