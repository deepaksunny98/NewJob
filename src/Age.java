import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		if(age>=18)
			System.out.println("Major");
		else
			if(age>0 && age<18)
				System.out.println("minor");
			else
				System.out.println("invalid");

	}

}
