package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.PersonClass;

import java.util.Scanner;

public class SearchForStudent {
    private Scanner tell = new Scanner(System.in);

    public boolean search(MyCircularQueue<PersonClass> searchFor) {

        System.out.println("Which way you like to search student from record's :\n" +
                "1.Roll Number\n" +
                "2.Name\n");
        switch (tell.nextInt()) {
            case 2 -> searchByName(searchFor);
            case 1 -> searchByRollNo(searchFor);
            default -> System.out.println("sorry wrong input try again");
        }
        return true;
    }

    private boolean searchByName(MyCircularQueue<PersonClass> searchFor) {
        boolean result = false;
        System.out.println("Enter the name :");
        String name = tell.nextLine();
        for (int i = 0; i < searchFor.getNoOfEntries(); i++) {
            PersonClass student = searchFor.getDataAtIndex(i);
            if (name.compareTo(student.getName()) == 0) {
                System.out.println("Student have been found at Serial no " + (i + 1));
                result = true;
            }
        }
        if (result != false) {
            System.out.println("Sorry your name is not found");
        }

        return true;
    }

    private boolean searchByRollNo(MyCircularQueue<PersonClass> searchFor) {
        boolean result = false;
        System.out.println("Enter the roll number :");
        long rollNo = tell.nextLong();
        for (int i = 0; i < searchFor.getNoOfEntries(); i++) {
            PersonClass student = searchFor.getDataAtIndex(i);
            if (rollNo == student.getRollNo()) {
                System.out.println("Student have been found at Serial no " + (i + 1));
                result = true;
                break;
            }
        }
        if (result != true) {
            System.out.println("Sorry your name is not found");
        }
        return true;
    }

}
