class M2 
{
	//non-static block
	//(IIB)instance initialization block this will be executed while objects are created before the execution of constructor
	{
		System.out.println(i);
	}

	int i;


	public static void main(String[] args) 
	{
		M2 m2 = new M2();
	}
}
//illegal forward reference applies to non-static variable also