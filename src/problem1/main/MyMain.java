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
        MyBinarySearchTree<Integer> familyMember = new MyBinarySearchTree();
        while (turnOff != true) {
            System.out.println("\nEnter the choice from Menu : \n" +
                    "\n1.Add a new record\n" +
                    "2.Print record's\n" +
                    "3.Delete record's\n" +
                    "4.Search record's\n" +
                    "5.Exit\n");
            System.out.print("Enter the choice : ");
            /**
             * here I have used enhanced switch case the menu selection
             * enhanced switch is been introduce in java 13 or later
             * enhanced switch does not required break keyword.
             */
            switch (tell.nextInt()) {
                case 1 -> {
                    System.out.print("\nAdd new member : ");
                    familyMember.add(tell.nextInt());
                }
                case 2 -> {
                    System.out.print("\nleft Member of family ");
                    familyMember.traverse();
                }
                case 3 -> {
                    System.out.print("\nEnter the Number : ");
                    familyMember.remove(tell.nextInt());
                }
                case 4 -> {
                    System.out.print("\nEnter the number to search For : ");
                    int data = tell.nextInt();
                    boolean found = familyMember.search(data);
                    if (found) {
                        System.out.println("Sorry " + data + " is not found");
                    } else {
                        System.out.print("Your " + data + " is been found");
                    }
                }
                case 5 -> turnOff = true;
                default -> throw new IllegalStateException("\nInvalid Input:");
            }
        }
    }
}
