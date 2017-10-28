import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueThread {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue queue = new ArrayBlockingQueue(1024);
		putThread putThread = new putThread(queue);
		getThread getThread = new getThread(queue);

		while(true) {
		new Thread(putThread).start();
		new Thread(getThread).start();
		Thread.sleep(4000);
		}
	}
}