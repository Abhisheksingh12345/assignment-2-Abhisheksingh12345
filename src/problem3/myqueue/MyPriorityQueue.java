/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;


public class MyPriorityQueue<E> {

    private Node<PersonClass> front = null;

    public void enqueue(PersonClass data) {
        Node<PersonClass> node = new Node<>(data);
        if (front == null) {
            front = node;
        } else if (front.getData().getRollNumber() == node.getData().getRollNumber()) {
            System.out.println("Duplicate Entry");
        } else {
            if (front.getData().getRollNumber() > node.getData().getRollNumber()) {
                node.setNext(front);
                front = node;
            } else {
                Node<PersonClass> temp = front;
                Node previous = null;
                while (temp != null && temp.getData().getRollNumber() < node.getData().getRollNumber()) {
                    previous = temp;
                    if (temp.getData().getRollNumber() < node.getData().getRollNumber()) {
                        temp = temp.getNext();
                    }
                }
                previous.setNext(node);
                if (temp != null) {
                    node.setNext(temp);
                }
            }
        }
    }

    public void peek() {
        System.out.println(front.getData().getRollNumber() + "  " + front.getData().getName());
    }

    public void dequeue() {
        System.out.println(front.getData().getRollNumber() + "  " + front.getData().getName());
        front = front.getNext();
    }
}
