import java.util.Scanner;

public class BiggestThreeConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int big =  (a>b && a>c) ? a : ((b>c) ? b : c);
		System.out.println("Biggest number is "+ big);

	}

}
