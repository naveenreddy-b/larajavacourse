 class A
{
	static int i;
}
public class P3
{
	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
		System.out.println("main:" + A.i);
	}
}