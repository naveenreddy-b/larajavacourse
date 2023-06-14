class F 
{
	public static void main(String[] args) 
	{
		String s1 = "101111001";
		int i = Integer.parseInt(s1, 2);
		System.out.println(i);
		int j = Integer.parseInt(s1 , 2);
		System.out.println(j);
	}
}
/*
    101111001

	       (2 power 0) * 1 +
	       (2 power 1) * 0 +
	       (2 power 2) * 0 +
	       (2 power 3) * 1 +
	       (2 power 4) * 1 +
	       (2 power 5) * 1 +
	       (2 power 6) * 1 +
	       (2 power 7) * 0 +
	       (2 power 8) * 1 +


		      1 + 0 + 0 + 8 + 16 + 32 + 64 + 0 + 256 = 377



*/