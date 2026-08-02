class Test
{
	static int x;
	int y;
	int z;
}

class StaticVariable
{
	public static void main(String args[])
	{
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		
		Test.x=18; t1.x=45; t2.x=32; t3.x=7;
			System.out.println(t1.x);
	}
}