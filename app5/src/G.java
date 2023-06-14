class G 
{
	public static void main(String[] args) 
	{
		int i =450;
		String s1 = Integer.toBinaryString(i);
		int j = Integer.parseInt(s1, 2);
		System.out.println(i);
		System.out.println(s1);
		System.out.println(j);
	}
}


/*
    111000010

	      (2 power 0) * 0 
	      (2 power 1) * 1
	      (2 power 2) * 0
	      (2 power 3) * 0
	      (2 power 4) * 0
	      (2 power 5) * 0
	      (2 power 6) * 1
	      (2 power 7) * 1
	      (2 power 8) * 1

             0 + 2 + 0 + 0 + 0 + 0 + 64 + 128 + 256 = 450
			 

			 450/2 = 225 + r0
			 225/2 = 112 + r1
			 112/2 = 56  + r0
			 56/2  = 28  + r0
			 14/2  = 7   + r0






*/