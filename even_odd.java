import java.util.Scanner;


class Test
{
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner s1=new Scanner(System.in);
		int n= s1.nextInt();
		
		
		if(n % 2 ==0)
		{
			System.out.println("number is even: "+s1);
		}
		else 
		{
			System.out.println("number is odd: "+s1);
		}
		s1.close();
	}
}