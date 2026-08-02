class Test
{
	int x;
	int y;
	void fun1()
	{
		System.out.println("Fun1 executed");
	}
}

class NewObj
{
	public static void main(String args[])
	{
		Test t1=new Test(); //t1 and t2 new object created
		Test t2=new Test();
		new Test(); // Unrefered Object
	}
}