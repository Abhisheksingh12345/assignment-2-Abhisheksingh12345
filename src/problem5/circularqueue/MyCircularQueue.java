/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.*;

//to implement circular queue
public class MyCircularQueue<E> implements MyCircularQueueADT<E> {
    private Node<E> front = null;
    private Node<E> rear = null;
    private int queueSize = 0;

    public void giveQueueSize(int size) {
        this.queueSize = size;
    }

    public int getSize() {
        return queueSize;
    }

    public Node<E> createCircularNode(E data) {
        return new Node<>(data);
    }

    private Node<E> addInQueue(E data, int frameSize) {
        if (frameSize <= queueSize) {
            if (front == null) {
                rear = front = createCircularNode(data);
            } else {
                Node<E> temp = createCircularNode(data);
                rear.setNext(temp);
                rear = temp;
            }
        }
        return front;
    }

    @Override
    public boolean enqueue(E data) {
        front = addInQueue(data, queueSize);
        return true;
    }

    private void deleteFromQueue() {
        front = front.getNext();
        queueSize--;
    }

    @Override
    public boolean dequeue() {
        deleteFromQueue();
        return false;
    }

    private void TraverseFromQueue() {
        Node<E> response = front;
        int i = 0;
        System.out.println("[");
        while (response.getNext() != null) {
            System.out.println(response.getData() + ", ");
            response = response.getNext();
            i++;
        }
        System.out.println("]");

    }

    @Override
    public boolean Traverse() {
        TraverseFromQueue();
        return true;
    }

    private void searchFromQueue(E data) {
        Node<E> response = front;
        boolean found = false;
        while (response != null) {
            if (response.getData() == data) {
                System.out.println("your " + data + " is been found");
                found = true;
            }
            if (found) System.out.println("sorry your data is not found from record");
        }
    }

    @Override
    public boolean search(E data) {
        searchFromQueue(data);
        return true;
    }
}
