class Z16
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		            //3    //2     //2      //3      //3      //4
		int j = test1(++i) + i + test2(i++) + i + test3(i++) + i + 
			//4     //5
		test4(++i) + i + 
			//6     //6      //7     //7      //8     //8
		test1(i++) + i + test2(++i) + i + test3(++i) + i + 
			//7     //9
		test4(i++) + i;
		System.out.println("main end:" + i + "," + j);
	}
	public static int test1(int i)
	{
		return ++i;
	}
	public static int test2(int i)
	{
		return i++;
	}
	public static int test3(int i)
	{
		return i--;
	}
	public static int test4(int i)
	{
		return --i;
	}
}
