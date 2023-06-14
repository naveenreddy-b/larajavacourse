class C1
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments:" + args.length);
		for (String elements : args )
		{
			System.out.println(elements);
		}
	}
}