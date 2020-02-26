import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.take();
            System.out.println("Object consumed" + queue.size());
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {

        }
    }
}