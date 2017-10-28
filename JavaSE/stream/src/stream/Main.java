package stream;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Special thread: " + Thread.currentThread().getName());

			}
		}, "Anonymous").start();

		th1.start();
		th2.runAndWait();
		th1.join();

		System.out.println("End of main");

	}

}
