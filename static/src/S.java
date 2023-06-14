class S 
{
	static int i = 10;
	static int j = 20;
	static int k;
	static int m = 30;
	public static void main(String[] args) 
	{
		System.out.println(i + "," + j + "," + k + "," + m);
		int i = 50;
		int j = 510;
		int k = 40;
		int m = 140;
		System.out.println(i + "," + j + "," + k + "," + m);
		System.out.println(S.i + "," + S.j + "," + S.k + "," + S.m);
	}
}
