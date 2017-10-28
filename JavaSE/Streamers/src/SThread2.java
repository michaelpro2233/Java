public class SThread2 extends Thread {

	private Test test;
	private Monitor m;
	
	
	public SThread2(Test test, Monitor m) {
		this.test = test;
		this.m = m;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			synchronized (m) {
			test.increment();
			}
			System.out.println(getName() + ", " + test.getX());

		}
	}

}
