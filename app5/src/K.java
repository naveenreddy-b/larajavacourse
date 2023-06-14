class K 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(130));
		System.out.println(Integer.toBinaryString(510));
		System.out.println(130 | 510);
		System.out.println(130 & 510);
		System.out.println(130 ^ 510);
		System.out.println(130 << 1);
		System.out.println(130 << 2);
		System.out.println(130 >> 1);
		System.out.println(130 >> 2);
	}
}
/*
binary of 130 : 010000010
binary of 510 : 111111110

////////////////////////////////////////
bitwise or :    111111110 = 510
bitwise and:    010000010 = 130
bitwise xor:    101111100 = 380


binary of 130 :     010000010
left shift by 1 :   100000100 = 260
left shift by 2 :  1000001000 = 520
right shift by 1 :  1000001 = 65
right shift by 2 :  100000 = 32

*/