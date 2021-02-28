package threads;

class Deepak extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
	
		t.setName("Sunny");
		System.out.println(t.getName());
		t.setPriority(8);
		System.out.println(t.getPriority());
		
		
		
		
	}
}

public class Thread1 {
	
	public static void main(String[] args) {
	Deepak d= new Deepak();
	d.start();

		
	}

}
