class N 
{
	public static void main(String[] args) 
	{
		int[] x={10,20,30,40,50,60,70,80};
		String[] y = {"siva","prasad","reddy"};
		jani1:
		for (String j : y)
		{
            if (j == "reddy")
			{
			   System.out.println("si");
            }
		    else
			{
			   System.out.println("pr");
			}
			for (int i : x)
			{
				if (i > 50)
				{
					continue jani1;
					//break jani1;
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
