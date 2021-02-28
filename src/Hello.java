import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter item number");
		int itemNo = s.nextInt();
		System.out.println("Enter Item Name");
		String itemName = s.next();
		System.out.println("Enter Rate");
		double rate = s.nextDouble();
		System.out.println("Enter Quantity");
		double quantity = s.nextDouble();
		double price = rate * quantity;
		
		System.out.println("Item Number" + itemNo);
		System.out.println("Item Name = "+itemName);
		System.out.println("Price = "+price);
		if(price > quantity)
		{
			if(price > quantity){
				
			}
		else if(price > quantity){
			
		}
			System.out.println();
		}	
			
		
	}

}
