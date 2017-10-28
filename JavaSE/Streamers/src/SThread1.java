
public class SThread1 extends Thread {

	private Test test;

	public SThread1(Test test) {
		this.test = test;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			test.increment();
			System.out.println(getName() + ", " + test.getX());

		}
	}

}
