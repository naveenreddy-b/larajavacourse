class O
{
          	int i;
          	O(int i)
           	{
                    		System.out.println("O(int)");
                    		this.i = i;
           	}
          	public static void main(String[] args) 
          	{
                    		System.out.println("main begin");
                    		O obj1 = new O(10);
                    		System.out.println("---------");
                    		O obj2 = new O(50);
                    		System.out.println("---------");
                    		O obj3 = new O(20);
                    		System.out.println("---------");
                    		System.out.println(obj1.i + ", " + obj2.i + "," + obj3.i);
                    	System.out.println("main end");
          	}
}

