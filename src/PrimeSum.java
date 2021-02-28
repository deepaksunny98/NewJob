
public class PrimeSum {

	public static void main(String[] args) 
	{
		int i, number, sum=0; 
		boolean count=true;
		
	
		for(number = 1; number <= 100; number++)
		{
			count=true;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count=false;
		    		break;
		    	}
		    }
		    if(count && number != 1 )
		    {
		    	sum=sum+number;
		    }  
		}
		System.out.println(sum);
	}

}
