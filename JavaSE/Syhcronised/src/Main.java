
public class Main {

	private static int steps = 100;

	public static void main(String[] args) throws InterruptedException {
		
		
		Monitor m = new Monitor();
		
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < steps; i++) {
					synchronized (m) {
						m.x++;
						if(m.x > 50) m.notify();
					}
					
					System.out.println(Thread.currentThread().getName() + ", " + m.x);
				}
			}
		});
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (m) {
				while(m.x < 50) {
					try {
						m.wait();
					} catch (InterruptedException e) {
						System.out.println("All is bad");
					}
				}
				}
			
				for (int i = 0; i < steps - 50; i++) {
					synchronized (m) {
						m.x++;
					}
					System.out.println(Thread.currentThread().getName() + ", " + m.x);
				}
			}
		});
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		System.out.println("main, " + m.x);
	}

}

class Monitor {
	public int x;
}
