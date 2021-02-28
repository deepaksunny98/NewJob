import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		while(n>0) {
			int	i=n%10;
			sum=sum+i;
			n/=10;
		
		}
		System.out.println("sum"+ sum);
		
	

	}

}
