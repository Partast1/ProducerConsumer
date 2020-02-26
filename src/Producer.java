import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            queue.put("a");
            System.out.println("Object Produced" + queue.size());
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {

        }
    }
}