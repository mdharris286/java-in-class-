package main;
public class Payment {
	void processpayment()
	{
		System.out.println("payment process appeared here");
	}
}
class Cashpayment extends Payment
{
	void processpayment()
	{
		System.out.println("cash payment");
	}
}
class Cardpayment extends Payment
{
	void processpayment()
	{
		System.out.println("card payment");
	}
}
