import java.io.*;

class FileH3
{
	public static void main(String args[]) throws IOException
	{
		FileReader f1=new FileReader("abc.txt");
		int ch;
		while((ch=f1.read())!=-1)
		{
			System.out.println((char)ch);
		}
	}
}