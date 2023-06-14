class BankAccount1 
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
}
class BankAccountDriver
{
	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount();
		System.out.println("Balance initial:" + account.getBalance());
		account.setdeposit(1000);
		System.out.println("Balance After deposit:" + account.getBalance());
		account.setwithdrawal(500);
		System.out.println("Balance After withdraw:" + account.getBalance());
	}
}
