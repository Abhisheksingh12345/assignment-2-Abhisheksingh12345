package problem3.myqueue;

public class PersonClass {
    private long rollNumber;
    private String name;

    public PersonClass(long rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
