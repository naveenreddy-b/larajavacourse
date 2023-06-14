class E 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.parseInt("10100101",2));
		System.out.println(Integer.toBinaryString(165));
		System.out.println(Integer.parseInt("10100101",2));
	}
}


/*

  10100101
          

		 (2 power 0) * 1 +
		 (2 power 1) * 0 +
		 (2 power 2) * 1 +
		 (2 power 3) * 0 +
		 (2 power 4) * 0 +
		 (2 power 5) * 1 +
		 (2 power 6) * 0 +
		 (2 power 7) * 1 +

	1 + 0 + 4 + 0 + 0 + 32 + 0 + 128 = 165
*/