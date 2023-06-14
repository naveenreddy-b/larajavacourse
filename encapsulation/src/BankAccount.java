class BankAccount 
{
	private double balance;

	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	public void withdraw(double amount)
	{
		this.balance -= amount;
	}
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount();
		account.deposit(1000);
		double balance = account.getBalance();
		System.out.println("Balance:" + balance);
	}
}
