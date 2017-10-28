package application;

public class ThreadCounter extends Thread {
		
	private int counter, steps;

	public ThreadCounter(int counter, int steps) {
		this.counter = counter;
		this.steps = steps;
	}

	@Override
	public void run() {
		for(int i = 0; i < steps; i++) {
			counter++;
			GlobalCounter.value++;
			GlobalCounter.aValue.getAndIncrement();
		}
		System.out.println(getName() + ", counter = " + counter);
	}
	
	
	
}
