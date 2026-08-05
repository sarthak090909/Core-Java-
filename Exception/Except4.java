import java.util.Scanner;
class Except2
{
	public static void main(String args[])
	{
		int cb=9000;
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter amount to withdraw: ");
		int wb=s1.nextInt();
		
		try
		{
				if(cb<wb)
				{
					throw new ArithmeticException("Insufficient Balance");
				}
				cb=cb-wb;
				System.out.println("Transaction Successful");
				System.out.println("Current Balance is: "+ cb);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage);
			System.out.println("Current Balance is "+ cb);
		}
	}
}