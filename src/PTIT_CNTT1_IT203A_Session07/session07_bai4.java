package PTIT_CNTT1_IT203A_Session07;

public class session07_bai4 {
    public static void main(String[] args) {
        ClassRoom student1 = new ClassRoom("Nguyen Van A");
        ClassRoom student2 = new ClassRoom("Tran Van B");

        student1.donateFund(20000);
        student2.donateFund(30000);

        ClassRoom.totalFund();
    }
}

