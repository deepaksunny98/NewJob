package oops;

class Student
{
	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	void setStudentDetails()
	{
		rollNum=101;
		studName="Deepak";
		mark1=80;
		mark2=90;
		mark3=95;
	}
	void calculateTotal()
	{
		totalMarks=mark1+mark2+mark3;
	}
	void displayStudDetails()
	{
		System.out.println("Student Roll Number: "+rollNum);
		System.out.println("Student Name: "+studName);
		System.out.println("Total Marks: "+totalMarks);
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setStudentDetails();
		s.calculateTotal();
		s.displayStudDetails();
		
	}

}
