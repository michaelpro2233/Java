package application;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		ThreadCounter th1 = new ThreadCounter(0, 10000);
		ThreadCounter th2 = new ThreadCounter(0, 10000);

		th1.start();
		th2.start();

		th1.join();
		th2.join();

		System.out.println("global counter = " + GlobalCounter.value);
		System.out.println("atomic counter = " + GlobalCounter.aValue.get());
		
	}

}
