class M 
{
	public static void main(String[] args) 
	{
		boolean[] x = {true,false,false,false};
		int[] y = {10,20,30,40};
		loop1:
			for (boolean j : x)
			{
				if (j == false)
				{
					System.out.println("siva");
				}
				else
				{
					System.out.println("prasad");
				}
				for (int i : y)
				{
					if (i == 30)
					{
						continue loop1;
						//break loop1;
					}
					else
					{
						System.out.println(i);
					}
				}
				System.out.println(j);
			}
	}
}
