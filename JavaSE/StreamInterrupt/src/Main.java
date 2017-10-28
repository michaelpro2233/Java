
public class Main {
	public static void main(String[] args) throws InterruptedException {
		CancelTest th = new CancelTest(0, "ThreadCancelTest");
		th.start();
//		th.interrupt();
		Thread.sleep(500);
		th.stop();
//		th.join(1000);
		System.out.println("End of main");
	}
}