import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		double dis = 1;
		if(price>=1000 && price<2000)
			dis = 0.10*price; 
		else if(price>=2000 && price<3000)
			dis = 0.15*price;
		else if(price>=3000 && price<5000)
			dis = 0.20*price;
		else if(price>5000)
			dis = 0.25*price;
		double netPrice = price-dis;
		System.out.println("Item Number" + itemNo);
		System.out.println("Item Name = "+itemName);
		System.out.println("Price = "+price);
		System.out.println("Discount = "+dis);
		System.out.println("Net Price = "+netPrice);
		
		
			

	}

}
