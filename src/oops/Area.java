package oops;
class Rectangle
{
	int length;
	int breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		int area=length*breadth;
		System.out.println("area is: "+area);
	}


}
class Rect extends Rectangle
{

	Rect(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}
      	
    
	
	
	
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(10,20);
		r.area();
		System.out.println(r);

	}

}
