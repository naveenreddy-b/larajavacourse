class I 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(45));
		System.out.println(Integer.toBinaryString(65));
		System.out.println(45 | 65); 
		System.out.println(45 & 65); 
		System.out.println(45 ^ 65); 
	}
}
/*
binary for 45 :   0101101
binary for 65 :   1000001
--------------------------------

  binary or   :   1101101 ==> 109
  binary and  :   0000001 ==> 1
  binary xor  :   1101100 ==> 108
*/