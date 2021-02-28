
public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumEven = 0, sumOdd = 0, i = 1;
		while(i<=100) {
			if(i%2==0) {
				sumEven++;
				}
				else {
					sumOdd++;
				}
			i++;
		}
		System.out.println("Sum of even numbers = "+sumEven);
		System.out.println("Sum of odd numbers = "+sumOdd);


	}

}
