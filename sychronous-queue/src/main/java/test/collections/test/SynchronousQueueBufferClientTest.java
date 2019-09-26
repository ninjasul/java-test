package test.collections.test;

import test.collections.blockingqueue.BlockingQueueBuffer;
import test.collections.blockingqueue.Consumer;
import test.collections.blockingqueue.Producer;
import test.collections.blockingqueue.SynchronousQueueBuffer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronousQueueBufferClientTest {
    public static void main(String[] args) {
        // Starting two threads
        ExecutorService executorService = null;
        try {
            BlockingQueueBuffer<Integer> buffer = new SynchronousQueueBuffer<>();
            executorService = Executors.newFixedThreadPool(2);
            executorService.execute(new Producer(buffer));
            executorService.execute(new Consumer(buffer));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(executorService != null) {
                executorService.shutdown();
            }
        }
    }
}