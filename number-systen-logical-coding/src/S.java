class S 
{
	public static void main(String[] args) 
	{
		int i = 12345;
		int sum = 0;
		while(i > 0)
		{
			int j= i % 10;
			sum= sum*10+j;
			i = i/10;
		}
		System.out.println(sum);
	}
}

/*{
	int givenNum = 12345;
	int reverseNum = 0;
	int digit;
	while(givenNum != 0)
	{
		digit = givenNum % 10;
		reverseNum = reverseNum * 10 + digit:
		reverseNum = givenNum / 10;
	}
}
System.out.println(reverseNum);*/
