class Except3
{
	public static void main(String args[])
	{
	int x=27;
	int y=0;
	
	System.out.println("A");
	try
	{
	int z=x/y;
	System.out.println(z);
	}
	
	catch(NullPointerException e1)
	{
		System.out.println(e1.getMessage());
	}
	
	finally
	{
		System.out.println("B");
	}
	
	}
}