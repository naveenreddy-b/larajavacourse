class N
{
          	int i; 
          	N(int i)
          	{
                 		System.out.println("N(int)" + i);
                 		i = i;
           	}
          	public static void main(String[] args) 
           	{
                 		System.out.println("main begin");
                 		N obj1 = new N(10);
                 		System.out.println("---------");
                 		N obj2 = new N(50);
                 		System.out.println("---------");  
                 		N obj3 = new N(20);
                 		System.out.println("---------");
                 		System.out.println(obj1.i + ", " + obj2.i + "," + obj3.i);
                 		System.out.println("main end");
           	}
}

