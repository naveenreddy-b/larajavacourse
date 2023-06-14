class E
{
	static int p;

	A()
	{
		p += 10;
	}

	{
		p += 20;
	}

	void test1()
	{
		p += 30;
	}
	static void test2()
	{
		p += 40;
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		E e2 = new E(10);
		E e3 = new E(10,20);
		E e4 = new E(20);
		E e5 = new E();
		System.out.println(count);

	}
}
