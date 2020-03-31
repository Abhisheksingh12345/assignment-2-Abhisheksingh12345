/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.PersonClass;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        functionBehaviour();
    }

    private static void functionBehaviour() {
        Scanner tell = new Scanner(System.in);
        boolean trun = false;
        MyCircularQueue<PersonClass> circularQueue = new MyCircularQueue();
        while (!trun) {
            System.out.println("\nEnter the function number from Menu\n" +
                    "1.Add the data in record\n" +
                    "2.Delete data from record\n" +
                    "3.print record\n" +
                    "4.Search for record\n" +
                    "5.Exit\n");
            switch (tell.nextInt()) {
                case 1 -> circularQueue.enqueue(new NewEntry().EnterPersonData());
                case 2 -> circularQueue.dequeue();
                case 3 -> new ViewPersonDetail().viewRecord(circularQueue);
                case 5 -> trun = true;
                case 4 -> new SearchForStudent().search(circularQueue);
                default -> System.out.println("sorry wrong input ");
            }
        }
    }
}


