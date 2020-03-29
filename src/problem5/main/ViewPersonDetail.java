package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.PersonClass;

public class ViewPersonDetail {
    boolean viewRecord(MyCircularQueue<PersonClass> student) {
        for (int i = 0; i < student.getNoOfEntries(); i++) {
            PersonClass particularDetail = student.getDataAtIndex(i);
            System.out.println("Sn " + (i + 1) + "." +
                    "Name :" + particularDetail.getName() + "\n" +
                    "\tAge  :" + particularDetail.getAge() + "\n" +
                    "\tRoll No :" + particularDetail.getRollNo());
        }
        return true;
    }
}
