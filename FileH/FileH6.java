import java.io.*;
import java.util.*;

class FileH6
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("abc.txt");
		Scanner s1=new Scanner(f1);
		String s2;
		
		try
		{
			while ((s2=s1.nextLine())!=null)
			{
				System.out.println(s2);
			}
		}
		catch(NoSuchElementException e1)
		{}
		s1.close();
	}
}