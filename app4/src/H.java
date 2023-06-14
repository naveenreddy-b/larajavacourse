class H 
{
	public static void main(String[] args) 
	{
		int i=10;
		System.out.println(i-- + i);//19
		System.out.println(i);//9
		int j=10;
		System.out.println(--j + j);//18
		System.out.println(j);//9
		int p=100;
		p= p++ + p +p++ + p + --p + --p+ ++p;
		// 100 +101+101 +102+ 101 + 100+ 101
		System.out.println(p);
		int q=40;
		System.out.println(q++);
		                  //41
		q= q++ + q++ + ++q+ ++q - --p + q++ + q++ + ++q + ++q;
		// 41  + 42  + 44 + 45  - 705  + 45  + 46  + 48  +  49=-345
		System.out.println(q);

	}
}
