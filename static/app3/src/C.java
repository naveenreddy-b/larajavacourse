class C 
{
	static int i;
	static int j =C.i;

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
