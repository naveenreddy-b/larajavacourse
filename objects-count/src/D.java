Dlass D 
{
	statiD int count;
	D()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		D obj1 = new D();
		System.out.println("a:" + count);
		D obj2 = new D();
		System.out.println("b:" + count);
		D obj3 = new D();
		System.out.println("c:" + count);
		D obj4 = new D();
		System.out.println("d:" + count);
		D obj5 = new D();
		System.out.println("e:" + count);

		System.out.println("f:" + obj1.count);
		System.out.println("g:" + obj2.count);
		System.out.println("g:" + obj3.count);
		System.out.println("h:" + obj4.count);
	}
}
