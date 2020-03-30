package problem5.main;

import problem5.student.PersonClass;

import java.util.Scanner;

public class NewEntry {
    public PersonClass EnterPersonData() {
        Scanner tell = new Scanner(System.in);
        PersonClass newPerson = new PersonClass();
        System.out.println("Enter the name :");
        newPerson.setName(tell.nextLine());
        System.out.println("Enter the age :");
        newPerson.setAge(tell.nextInt());
        System.out.println("Enter the roll no :");
        newPerson.setRollNo(tell.nextLong());
        return newPerson;
    }
}
