class D 
{
	int i;
	int j = 20;
	D()
	{
		System.out.println("Hello World!");
		i = 10;
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("-------");
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}
//non-static members can be used straight away in the non-static context without a reference variable
