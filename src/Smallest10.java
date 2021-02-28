import java.util.Scanner;

public class Smallest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int small = 15440, i=1;
		while(i<=10) {
			System.out.println("Enter the number");
			int n=s.nextInt();
			if(n<=small)
				small=n;
			i++;
		}
		System.out.println("smallest number is "+small);

	}

}
