class Except1
{
	public static void main(String args[])
	{
	System.out.println("A");
	try
	{
	int z=x/y;
	System.out.println(z);
	}
	
	catch(ArithmeticException e1)
	{
		System.out.println(e1.getMessage());
		
	}
	System.out.println("B");
	}
}