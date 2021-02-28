import java.util.Scanner;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int sum=0;
		int[][] a = new int[3][3];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=s.nextInt();
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
		System.out.println("Elements in the array are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println(sum);

	}

}
