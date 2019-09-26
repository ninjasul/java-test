package collections.blockingqueue;

public class Consumer implements Runnable {
    private final BlockingQueueBuffer buffer;

    public Consumer(BlockingQueueBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            try {
                buffer.get();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}