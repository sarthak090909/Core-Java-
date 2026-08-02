class Test
{
	private static int x;
	private static int y;
	
	static void setData()
	{
		x=5;
		y=10;
	}
	
	static void displayData()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

class PrivateVariable
{
	public static void main(String args[])
	{
		
		Test.setData();
		Test.displayData();
	}
}