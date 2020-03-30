/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem3.node.Node;

public class MyQueue<E> {
    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    public void add(E data) {
        front = addInQueue(data);
        size++;
    }

    private Node<E> addInQueue(E data) {
        if (front == null) {
            rear = front = new Node<>(data);
        } else {
            Node<E> temp = new Node<>(data);
            rear.setNext(temp);
            front = rear;
            rear = temp;
        }
        return front;
    }

}
