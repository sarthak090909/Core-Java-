class Test
{
	int x;
	int y;
	
	void fun1()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

class Assign
{
	public static void main(String args[])
	{
		Test t1=new Test();;
		t1.x=45; t1.y=18; t1.fun1();
	}
}