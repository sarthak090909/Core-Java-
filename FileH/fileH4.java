import java.io.*;

class FileH4
{
	public static void main(String args[]) throws IOException
	{
	BufferedWriter b1=new BufferedWriter(new FileWriter("abc.txt"));
	b1.write("Coding Seekho 1 ");
	b1.newLine();
	b1.write("Coding seekho 2 ");
	b1.newLine();
	b1.write("Coding Seekho 3");
	b1.close();
	}
}