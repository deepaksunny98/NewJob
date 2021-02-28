package oops;
class Book
{
	int bno;
	String bname;
	int price;
	Book(int bno,String bname,int price)
	{
		this.bno=bno;
		this.bname=bname;
		this.price=price;
	}
	Book()
	{
		
	}
	final void display() {
		System.out.println("Book Number:"+bno);
		System.out.println("Book Name:"+bname);
		System.out.println("Price:"+price);
	}
	
	
}
class SpecialEditionBook extends Book 
{
	int discount;
	SpecialEditionBook(int bno,String bname,int price,int discount)
	{
		super(bno,bname,price);
		this.discount=discount;
	}
	void fdisplay()
	{
		super.display();
		System.out.println("Discount:"+discount);
	}
}
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book(101,"Deepak",1000);
		b.display();
		SpecialEditionBook e = new SpecialEditionBook(201,"Sunny",1545,20);
		e.display();

	}

}
