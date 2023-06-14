class J 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=a++ + a + a++ + a + a-- + a;
		System.out.println(a);//1
		System.out.println(b);//7
		int c=0;
		int d=++c + c + ++c + c + --c + c;
		System.out.println(c);//1
		System.out.println(d);//8
	}
}
