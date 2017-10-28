
public class Main {

	private static int nThreads = 100;

	public static void main(String[] args) throws InterruptedException {

//		SThread1[] threads = new SThread1[nThreads];
		SThread2[] threads = new SThread2[nThreads];
		Test test = new Test(0);
		Monitor monitor = new Monitor();

		for (int i = 0; i < nThreads; i++) {
			threads[i] = new SThread2(test, monitor);
			threads[i].start();
		}

		for (int i = 0; i < nThreads; i++) {
			threads[i].join();
		}

		System.out.println("Test x = " + test.getX());

	}

}
