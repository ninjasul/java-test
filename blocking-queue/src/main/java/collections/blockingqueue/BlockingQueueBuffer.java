package collections.blockingqueue;

public interface BlockingQueueBuffer<T> {
    void get();
    void put(T data);
}