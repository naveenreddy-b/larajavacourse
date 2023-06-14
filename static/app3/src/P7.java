class A
{
	static int i;
	static
	{
		System.out.println("SIB1 from A");
	}
	static
	{
		System.out.println("SIB2 from A");
	}

}
class P7
{
	static
	{
		System.out.println("SIB2 from P7");
	}

	public static void main(String[] args) 
	{
		System.out.println("main:" + A.i);
	}
}