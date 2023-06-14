class J 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(85));
		System.out.println(Integer.toBinaryString(90));
		System.out.println(85 | 90); 
		System.out.println(85 & 90); 
		System.out.println(85 ^ 90);
	}
}
/*
  binary for 85 : 1010101
  binary for 90 : 1011010

  ================================
  binary or     : 1011111 = 95
  binary and    : 1010000 = 80
  binary xor    : 0001111 = 15
*/