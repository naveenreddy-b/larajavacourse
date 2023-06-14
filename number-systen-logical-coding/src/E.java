class E 
{
	public static void main(String[] args) 
	{
		int i = 1000000000;
		int j = i;
		int count = 0;
		while (i != 0)
		{
			count ++;
			i = i/10;
		}
		System.out.println("number of digits in " + j + " is " + count);
	}
}
