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
    private int noOfEntries = 0;

    public int getNoOfEntries() {
        return noOfEntries;
    }

    public int setQueueSize(int size) {
        this.queueSize = size;
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
        noOfEntries++;
        return true;
    }

    private Node<E> deleteFromQueue() {
        front = front.getNext();
        return front;
    }

    @Override
    public boolean dequeue() {
        front = deleteFromQueue();
        noOfEntries--;
        return false;
    }

    private boolean TraverseFromQueue(Node<E> front) {
        Node<E> response = front;
        System.out.print("[");
        while (response.getNext() != null) {
            System.out.print(response.getData() + ", ");
            response = response.getNext();
        }
        System.out.print(response.getData() + "]\n");
        return true;

    }

    public E getDataAtIndex(int i) {
        Node<E> node = getNode(i);
        return node.getData();
    }

    private Node<E> getNode(int index) {
        Node<E> response = front;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    @Override
    public boolean Traverse() {
        TraverseFromQueue(front);
        return true;
    }

    private void searchFromQueue(E data, Node<E> front) {
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

    public int getQueueSize() {
        return queueSize;
    }

    @Override
    public boolean search(E data) {
        searchFromQueue(data, front);
        return true;
    }
}
