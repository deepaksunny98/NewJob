package exception;

class WithdrawException extends Exception
{
	WithdrawException(String msg)
	{
		super(msg);
		
	}
	WithdrawException(){
    }
}	
class Account
{
	void withdraw(int amount, int balance) throws WithdrawException
	{
		if(amount>balance)
			throw new WithdrawException("insufficient funds");
	}
}
public class UserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Account a= new Account();
			a.withdraw(1000,500);
		}
		catch(WithdrawException e) {
			e.printStackTrace();
		}

	}

}
