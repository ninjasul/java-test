package collections.blockingqueue;

import java.util.concurrent.BlockingQueue;

public abstract class AbstractBlockingQueueBuffer<T> implements BlockingQueueBuffer<T> {
    protected BlockingQueue<T> blockingQueue;

    public AbstractBlockingQueueBuffer(BlockingQueue<T> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void get() {
        try {
            System.out.printf("[%s] Consumer received - %s\n", Thread.currentThread().getName(), blockingQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void put(T data) {
        try {
            // putting in synchronousQueue
            blockingQueue.put(data);
            System.out.printf("[%s] Producer produced - %s\n", Thread.currentThread().getName(), data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}