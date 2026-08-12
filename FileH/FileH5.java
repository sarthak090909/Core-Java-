import java.io.*;

class FileH5
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader b1=new BufferedReader(new FileReader("abc.txt"));;
		String s1;
		while((s1=b1.readLine())!=null)
		{
			System.out.println(s1);
		}
		b1.close();
	}
}