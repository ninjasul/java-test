package collections.blockingqueue.test;

import collections.blockingqueue.BlockingQueueBuffer;
import collections.blockingqueue.Consumer;
import collections.blockingqueue.LinkedBlockingQueueBuffer;
import collections.blockingqueue.Producer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LinkedBlockingQueueBufferClientTest {
    public static void main(String[] args) {
        // Starting two threads
        ExecutorService executorService = null;
        try {
            BlockingQueueBuffer<Integer> buffer = new LinkedBlockingQueueBuffer<>(2);
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