//parent/base/super class//
class A 
{
	int i;
}
//child/derived/sub-class
//extends is a keyword
//one class can be able to extend at a time
//at atime a class can able to extend only one class
//single inheritance//
class B extends A
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
/*inheritance is a process of aquiring properties and
behaviours from another class
by using inheritance we can achive code reusability\*


