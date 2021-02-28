package threads;


class MyThread extends Thread
{
	public void run()
	{
		//System.out.println("I am a thread");
		Thread t = Thread.currentThread();
		System.out.println(t);//Thread[Thread-0,5,main]
		t.setName("MyThread");
		System.out.println(t);//Thread[MyThread,5,main]
		System.out.println(t.getName());//MyThread
		t.setPriority(2);
		/*
		 IF the priority is <1 or >10 then it will throw IllegalArgumentException
		 */
		System.out.println(t);//Thread[MyThread,8,main]
		System.out.println(t.getPriority());//8
	}}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();//creates a thread and invokes run()
	
		
	}
}
