package stream;

public class MyThread1 extends Thread{

	@Override
	public void run() {
		System.out.println("Hello from " + getName());
	}
	
}
