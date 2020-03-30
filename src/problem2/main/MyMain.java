/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;
public class MyMain {
    public static void main(String[] args) {
        performOperationFunction();
    }

    private static void performOperationFunction() {
        MyBinarySearchTree<Integer> treeFamily = new MyBinarySearchTree();
        Scanner tell = new Scanner(System.in);
        System.out.println("How many element do you want to test");
        int no = tell.nextInt();
        for (int i = 0; i < no; i++) {
            treeFamily.add(tell.nextInt());
        }
        System.out.println("Enter the Order" +
                "1.preOrder format" +
                "2.postOrder format");
        int choice = tell.nextInt();
        switch (choice) {
            // here root is first element
            case 1 -> treeFamily.traversePerOrder(treeFamily.getRoot());
            // here root is last element
            case 2 -> treeFamily.traversePostOrder(treeFamily.getRoot());
        }
    }

}
