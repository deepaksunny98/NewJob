package collections;
import java.util.*;
class Book
{
	int bno;
	String bname;
	int price;
	public Book(int bno, String bname, int price) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}
	public String toString() {
	
	return bno+" "+bname+" "+price;
	}

}

class Library
{
	TreeSet<Book> book;//b1,b2,b3
	Library()
	{
		book = new TreeSet<Book>(new PriceComparator());
	}
	void addBook(Book b)
	{
		book.add(b);
	}
	void display() {
		for(Book b:book)
			System.out.println(b);
	}

}

class PriceComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book b1=(Book) o1;
		Book b2=(Book) o2;
		if (b2.price<b1.price)
			return +1;
		else if (b2.price>b1.price)
			return -1;
		else
		return 0;
		
	}
	
}

public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(101,"Deepak",1000);
		Book b2=new Book(102,"Sunny",2000);
		Book b3=new Book(103,"Sunny",3000);
		Library l=new Library();
		l.addBook(b1);
		l.addBook(b2);
		l.addBook(b3);
		l.display();

	}

}
