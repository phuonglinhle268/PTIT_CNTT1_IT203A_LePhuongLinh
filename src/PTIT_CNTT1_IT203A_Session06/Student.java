package PTIT_CNTT1_IT203A_Session06;

// bài 1
public class Student {
    private String studentID;
    private String studentName;
    private int year;
    private double avgScore;

    public Student(String studentID, String studentName, int year, double avgScore){
        this.studentID = studentID;
        this.studentName = studentName;
        this.year = year;
        this.avgScore = avgScore;
    }

    public void studentInfo(){
        System.out.println("Mã sinh viên: " + studentID);
        System.out.println("Tên: " + studentName);
        System.out.println("Năm sinh: " + year);
        System.out.println("Điểm trung bình: " + avgScore);
    }

}

