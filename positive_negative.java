import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner n1=new Scanner(System.in);
		int n= n1.nextInt();
		
		if(n>0)
		{
			System.out.println("Number is positive");
		}
		else if(n<0)
		{
			System.out.println("number is negative");
		}
		else if(n==0)
		{
			System.out.println("number is zero");
		}
		
	}
}