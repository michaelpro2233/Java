import java.util.concurrent.BlockingQueue;

public class putThread implements Runnable{

    protected BlockingQueue queue = null;

    public putThread(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("Tic-");
            Thread.sleep(1000);
            queue.put("Tac-");
            Thread.sleep(1000);
            queue.put("Toe");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}