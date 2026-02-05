package PTIT_CNTT1_IT203A_Session09.bai1;

public class Student extends Person{
    private String studentID;
    private double avgScore;

    public Student(String fullname, double age, String studentID, double avgScore) {
        super(fullname, age);
        this.studentID = studentID;
        this.avgScore = avgScore;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Mã sinh viên: " + studentID);
        System.out.println("Điểm trung bình: " + avgScore);
    }
}


