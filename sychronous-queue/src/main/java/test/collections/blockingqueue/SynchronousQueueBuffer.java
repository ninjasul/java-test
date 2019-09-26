package test.collections.blockingqueue;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueBuffer<T> extends AbstractBlockingQueueBuffer<T> {
    public SynchronousQueueBuffer() {
        super(new SynchronousQueue<T>());
    }

}