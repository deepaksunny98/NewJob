
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1,sum=0;
		System.out.println("...........................");
		System.out.println("Number            Factorial");
		System.out.println("...........................");
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				f = f * j;
			}
			sum=sum+f;
			System.out.println(i+"                     "+f);
			f=1;
		}
		System.out.println("...........................");
		System.out.println("sum         =         "+sum);
		

	}

}
