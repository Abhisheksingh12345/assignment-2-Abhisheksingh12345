/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        allQueueFunction();
    }

    private static void allQueueFunction() {
        Scanner tell = new Scanner(System.in);
        System.out.println("your are going add data in tree structure and printing out all the pre - order successor");
        boolean exit = false;
        int atLestInput = 3;
        System.out.println("provide data to tree ablest 3 input are required to outcome with better out put :");
        MyBinarySearchTree<Integer> binaryAccess = new MyBinarySearchTree<>();
        while (exit != true) {
            do {
                binaryAccess.add(tell.nextInt());
                atLestInput--;
            } while (atLestInput > 0);
            System.out.print("do you like add more (y/n) : ");
            char nm = (tell.next()).charAt(0);
            if (nm == 'n') {
                exit = true;
            }
        }
        perOrderSuccess(binaryAccess);
        binaryAccess.traverse();
    }

    private static void perOrderSuccess(MyBinarySearchTree<Integer> intoQueue) {

        for (int i = 0; i < intoQueue.getSize(); i++) {

        }
    }

}
