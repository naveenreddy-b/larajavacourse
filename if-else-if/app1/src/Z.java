class Z 
{
	public static void main(String[] args) 
	{
		int i=0;
        if ((++i == 1) || (i++ == 2))
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("Hello World!");
		System.out.println(i);
	}
}
