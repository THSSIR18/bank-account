public class BankAccount
{
	private String owner;
	private double balance;
	
	public BankAccount(String x, double y)
	{
		owner = x;
		balance = y ;
	}
	public String getOwner()
	{
		return owner;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double d)
	{
		balance += d;
	}
	public void withdrawl(double w)
	{
		balance -= w;
	}
		public String toString()
	{
		System.out.println( owner + " your account balance is " + balance );
		return "";
	} 
	
}