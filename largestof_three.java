import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		System.out.println("Enter first number: ");
		Scanner s1=new Scanner(System.in);
		int n1= s1.nextInt();
		
		System.out.println("Enter 2nd number: ");
		Scanner s2=new Scanner(System.in);
		int n2= s2.nextInt();
		
		System.out.println("Enter 3rd number: ");
		Scanner s3=new Scanner(System.in);
		int n3=s3.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 is the greatest "+ n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("n2 is the greatest "+ n2);
		}
		else if(n3>n1 && n3>n2)
		{
			System.out.println("n3 is the greatest "+ n3);
		}
		
	}
}


