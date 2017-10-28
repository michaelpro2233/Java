
public class CancelTest implements Runnable {

	private int data;
	private final Thread thread;
	private boolean canWork;

	public CancelTest(int data, String thName) {
		this.data = data;
		canWork = true;
		thread = new Thread(this, thName);
	}

	@Override
	public void run() {
		
		while(canWork) {
		
//		while (true) {
			data++;
			System.out.println(Thread.currentThread().getName() + ", data = " + data);
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				System.out.println("Interrupted");
//				break;
//			}
		}
	}

	public void start() {
		thread.start();
	}
	
	public void stop() {
		canWork = false;
	}
	
	public void interrupt() {
		thread.interrupt();
	}

	public void join(int millisec) {
		try {
			thread.join(millisec);
		} catch (InterruptedException e) {
			System.out.println("Interrupted thread " + thread.getName());
		}
	}

}
