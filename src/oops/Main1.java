package oops;

class Account
{
	int accountNo;
	String accountType;
	int accountBalance;
	void setAccountDetails()
	{
		accountNo=101;
		accountType="savings";
		accountBalance=1000;
	}
	void withdraw(int amount)
		{
			accountBalance-=amount;
		}
	void deposit(int amount)
	{
		accountBalance+=amount;
	}
	void dispAccountDetails()
	{
		System.out.println("Account Number: "+accountNo);
		System.out.println("Account Type: "+accountType);
		System.out.println("Account Balance: "+accountBalance);
	}
	
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a= new Account();
		a.setAccountDetails();
		a.withdraw(500);
		a.deposit(300);
		a.dispAccountDetails();

	}

}
