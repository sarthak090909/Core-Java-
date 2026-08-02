class Test
{
	public static void rupali()
	{
		System.out.println("Hello rupali");
	}
	
	public static void rupesh()
	{
		System.out.println("Hello Rupali");
	}
}

class FunCall
{
	public static void main(String args[])
	{
		Test.rupali();
		System.out.println("Hello main");
		Test.rupesh();
		
	}
}