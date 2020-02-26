import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws Exception {

//        Creating Threadsafe queue
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(6);


        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

//        Starts Threads
        while (true) {
            new Thread(producer).start();
            new Thread(consumer).start();
        }

    }
}
