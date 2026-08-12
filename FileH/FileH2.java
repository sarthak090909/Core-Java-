import java.io.*;

class FileH2
{
	public static void main(String args[]) throws IOException
	{
		FileWriter f1=new FileWriter("abc.txt", true); // herre true because , by default it is false
		String s1= "Coding Seekho";
		f1.write(s1);
		f1.close();
		System.out.println("Data Written Successfully");
	}
}