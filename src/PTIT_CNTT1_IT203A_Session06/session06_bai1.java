package PTIT_CNTT1_IT203A_Session06;

public class session06_bai1 {
    public static void main(String[] args) {
        Student student1 = new Student("sv1", "Nguyen Van A", 2025, 9);
        Student student2 = new Student("sv2", "Le Van B", 2020, 8.5);

        student1.studentInfo();
        System.out.println(" ");
        student2.studentInfo();
    }
}
