abstract class Payment
{
	abstract void pay();
}

class UPIPayment extends Payment
{
	void pay()
	{
		System.out.println("Payment done using UPI");
	}
}

class CardPayment extends Payment
{
	void pay()
	{
		System.out.println("Payment done using card");
	}
}

class CashPayment extends Payment
{
	void pay()
	{
		System.out.println("Payment done successfully using Cash");
	}
}

class Test
{
	public static void main(String args[])
	{
		Payment p1=new UPIPayment();
		Payment p2=new CardPayment();
		Payment p3=new CashPayment();
		
		p1.pay();
		p2.pay();
		p3.pay();
	}
}