import java.util.concurrent.BlockingQueue;

public class getThread implements Runnable{

    protected BlockingQueue queue = null;

    public getThread(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            System.out.print(queue.take());
            System.out.print(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}