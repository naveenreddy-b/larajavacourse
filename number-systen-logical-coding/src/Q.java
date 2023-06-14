class Q 
{
	public static void main(String[] args) 
	{
		int i = 23568924;
		int count = 0;
		int d1;
		while (i != 0)
		{
			d1 = i % 10;
			if(d1 % 2 == 0)
			{
				count ++;
			}
			i = i / 10;
		}
		System.out.println(count);
	}
}
