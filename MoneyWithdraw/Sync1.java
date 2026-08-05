import java.util.*;
class Account 
{
	private int bal;
	
	Account(int x)
	{
		bal=x;
	}
	
	
	public boolean isSufficientBal(int wb)
	{
		if(bal >= wb)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void withdraw(int wb)
	{
		bal = bal-wb;
		System.out.println("Money Withdrawn");
		System.out.println("Current Balance is: "+bal);
	}
	
	public void cbal()
	{
		System.out.println("Current Balance is: "+ bal);
	}
}

class Customer implements Runnable
{
	private String name;
	private Account g1;
	
	Customer(String s1, Account b1)
	{
		name=s1;
		g1=b1;
	}
	
	public void run()
	{
		Scanner s2=new Scanner(System.in);
		synchronized(g1)
		{
			System.out.println(name+", Enter amount to withdraw");
			int wb=s2.nextInt();
			if(g1.isSufficientBal(wb))
			{
				g1.withdraw(wb);
			}
			else
			{
				System.out.println("Insufficient Balance");
				g1.cbal();
			}
		}
	}
}

class Sync1
{
	public static void main(String args[])
	{
		Account a1=new Account(10000);
		Customer c1=new Customer("Raj", a1);
		Customer c2=new Customer("Simran",a1);
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
	}
}


