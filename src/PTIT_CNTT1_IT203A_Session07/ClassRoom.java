package PTIT_CNTT1_IT203A_Session07;


// bài 4
public class ClassRoom {
    public static int classFund = 0;

    private String studentName;
    public ClassRoom(String studentName){
        this.studentName = studentName;
    }

    public void donateFund(int amount){
        classFund += amount;
        System.out.println(studentName + " nộp " + amount + " VNĐ vào quỹ lớp");
    }

    public static void totalFund() {
        System.out.println("Tổng quỹ lớp: " + classFund + "VNĐ");
    }
}
