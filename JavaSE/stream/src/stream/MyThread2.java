package stream;

public class MyThread2 implements Runnable {

	private Thread thread;

	public MyThread2() {
		thread = new Thread(this, "My runnable");
	}

	@Override
	public void run() {
		System.out.println("Hello from " + Thread.currentThread().getName());
	}

	public void runAndWait() throws InterruptedException {
		thread.start();
		thread.join();
	}
}
