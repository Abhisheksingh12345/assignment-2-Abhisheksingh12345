/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.myqueue.PersonClass;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue<PersonClass> queue = new MyPriorityQueue<>();
        /**
         * sample output
         */
        queue.enqueue(new PersonClass(181500372, "Loki"));
        queue.enqueue(new PersonClass(181500348, "Mayank"));
        queue.enqueue(new PersonClass(181500358, "Halo"));
        queue.enqueue(new PersonClass(181500399, "Zeus"));
        queue.enqueue(new PersonClass(181500009, "Atreus"));
        queue.enqueue(new PersonClass(181500010, "Kratos"));
        queue.dequeue();
        queue.dequeue();
    }
}

