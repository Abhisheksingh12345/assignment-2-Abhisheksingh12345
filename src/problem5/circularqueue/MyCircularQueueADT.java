package problem5.circularqueue;

public interface MyCircularQueueADT<E> {
    boolean enqueue(E data);

    boolean dequeue();

    boolean Traverse();

    boolean search(E data);
}
