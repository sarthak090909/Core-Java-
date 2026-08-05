class ArrayIOB
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		System.out.println("A");
		a[1]=45;
		try
		{
			a[6]=18;
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		System.out.println("B");
	}
}