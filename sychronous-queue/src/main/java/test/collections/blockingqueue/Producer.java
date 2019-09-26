package test.collections.blockingqueue;

import java.util.Random;

public class Producer implements Runnable {
    private final BlockingQueueBuffer buffer;

    public Producer(BlockingQueueBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            Random random = new Random();
            int data = random.nextInt(1000);
            buffer.put(data);
        }
    }
}