import java.io.*;

class FileH1
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("abc.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println(f1.getName());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.length());
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
	}
}