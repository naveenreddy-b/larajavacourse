import java.util.Scanner;
class H
{
	public static void main(String[] args) 
	{
		System.out.println("please enter three int value:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		System.out.println("addition of three int values is: " + (i + j + k));
	}
}
