class P 
{
	public static void main(String[] args) 
	{
		int i=0;
		while (i < 4)
		{
			i++;
			System.out.println("while begin");
			if (i>2)
			{
				continue;
			}
			System.out.println("end");
		}
	}
}
