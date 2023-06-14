class D 
{
	public static void main(String[] args) 
	{
		int i = 30;
		int j = 45;
		char k='c';
		char l='h';
		String s1 = Integer.toBinaryString(i);
		String s2 = Integer.toBinaryString(i+j);
		String s3 = Integer.toBinaryString(j);
		String s4 = Integer.toBinaryString(j-i);
		String s5 = Integer.toBinaryString(k);
		String s6 = Integer.toBinaryString(l);
		String s7 = Integer.toBinaryString('a');
		String s8 = Integer.toBinaryString(i);
		System.out.println(i);
		System.out.println(j);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
	}
}
