package oops;

class AccountConst
{
	int accountNo;
	String accountType;
	int accountBalance;
	AccountConst(int accountNo, String accountType, int accountBalance)
	{
		this.accountNo=accountNo;
		this.accountType=accountType;
		this.accountBalance=accountBalance;
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
public class Main1Const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountConst a= new AccountConst(101,"Deepak",2000);
	
		a.withdraw(500);
		a.deposit(300);
		a.dispAccountDetails();

	}

}
