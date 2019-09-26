package collections.blockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueBuffer<T> extends AbstractBlockingQueueBuffer<T> {
    public LinkedBlockingQueueBuffer() {
        super(new LinkedBlockingQueue<T>());
    }

    public LinkedBlockingQueueBuffer(int capacity) {
        super(new LinkedBlockingQueue<T>(capacity));
    }
}