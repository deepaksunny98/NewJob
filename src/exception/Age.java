package exception;

import java.io.PrintStream;

class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);
	}
	AgeException(){
		
	}
}
class SetAge
{
	void setYear(int age) throws AgeException
	{
		if(age<18 || age>60)
			throw new AgeException("Not Eligible");
	}
}

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetAge a= new SetAge();
		try {
	
		a.setYear(77);
		}
		catch(AgeException e)
		{
		
			e.printStackTrace();;
			
		}

	}

}
