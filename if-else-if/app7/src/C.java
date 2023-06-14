class C 
{
	public static void main(String[] args) 
	{
		int i = 3;
		switch (i)
		{
		case 2:
			System.out.println("from case2");
			break;
		case 5:
			System.out.println("from case5");
			break;
		case 3:
			System.out.println("from case3");
			continue;
		case 7:
			System.out.println("from case7");
		case 10:
			System.out.println("from case10");
			break;
		}
	}
}
