package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.PersonClass;

class ViewPersonDetail {
    public boolean viewDetail(MyCircularQueue<PersonClass> student) {
        System.out.println("List of all Student Detail :");
        for (int i = 0; i < student.getNoOfEntries(); i++) {
            PersonClass particularDetail = student.getDataAtIndex(i);
            System.out.println("Sn " + (i + 1) + "." +
                    " Name\t\t : " + particularDetail.getName() + "\n" +
                    "\t  Age \t\t :" + particularDetail.getAge() + "\n" +
                    "\t  RollNumber :" + particularDetail.getRollNo());
        }
        return true;
    }

}
