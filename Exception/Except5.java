import java.io.*;
class Except5
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("A");
		
		try
		{
			throw new IOException();
		}
		
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
		System.out.println("B");
	}
}