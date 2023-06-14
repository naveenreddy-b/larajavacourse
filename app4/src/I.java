class I 
{
	public static void main(String[] args) 
	{
		int i= 0;
		int j =i++ + i + i++ + i;
		System.out.println(i);//2
		System.out.println(j);//4
		int m= 0;
		int n=++m + m + ++m + m;
		System.out.println(m);//2
		System.out.println(n);//6
	}
}
