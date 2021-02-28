import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<a.length;i++)
			a[i] = s.nextInt();
		for (int v=0;v<a.length;v++)
		{
		for(int j=v+1;j<a.length;j++)
			{
			
				if(a[v]>a[j])
				{
					temp=a[v];
					a[j]=a[v];
					a[j]=temp;
				}
						
			}
		}
		System.out.println("biggest number is "+a[size-1]);
		System.out.println("Second biggest number is "+a[size-2]);
		System.out.println("smallest number is "+a[0]);
		System.out.println("second smallest number is "+a[1]);
		for(int b : a)
			System.out.println(b);
		
		

	}

}
