public class Test {

	private int x;

	public Test(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

//	public synchronized void increment() {
	public void increment() {
		x++;
	}
}
