/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        menuFunction();
    }

    public static void menuFunction() {
        boolean turnOff = false;
        Scanner tell = new Scanner(System.in);
        while (turnOff != true) {
            System.out.println("Enter the choice from Menu : \n" +
                    "1.Add a new record\n" +
                    "2.Print record's\n" +
                    "3.Delete record's\n" +
                    "4.Search record's\n" +
                    "5.Exit\n");
            /**
             * here I have used enhanced switch case the menu selection
             * enhanced switch is been introduce in java 13 or later
             * enhanced switch does not required break keyword.
             */
            MyBinarySearchTree<Integer> familyMember = new MyBinarySearchTree();
            switch (tell.nextInt()) {
                case 1 -> {
                    System.out.println("Enter the No :");
                    familyMember.add(tell.nextInt());
                }
                case 2 -> familyMember.traverse();
                case 3 -> familyMember.remove(tell.nextInt());
                case 4 -> familyMember.search(tell.nextInt());
                case 5 -> turnOff = true;
                default -> throw new IllegalStateException("Invalid Input:");
            }
        }
    }
}
