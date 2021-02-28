import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Eneter size of array");
		int size = s.nextInt();
		
		
		int[] a = new int[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
			for(int i : a)
				System.out.println(i);
			System.out.println("Eneter a number to be searched");
			int num= s.nextInt();
			boolean b=true;
			
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
					 b=false;
				
			}
			if(!b)
				System.out.println("Element found");
			else
				System.out.println("Element not found");

	}

}
