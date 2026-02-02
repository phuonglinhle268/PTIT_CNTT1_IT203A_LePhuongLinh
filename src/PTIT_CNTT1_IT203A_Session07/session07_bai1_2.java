package PTIT_CNTT1_IT203A_Session07;

public class session07_bai1_2 {
    // bài 1
//    public static void main(String[] args) {
////        Student s1 = new Student("SV01", "Nguyen Van A");
////        Student s2 = new Student("SV02", "Tran Van B");
////        s1.studentInfo();
////        System.out.println(" ");
////        s2.studentInfo();
////        System.out.println("-----------");
////        Student.displayStudent();
//    }

// bài 2
public static void main(String[] args) {
    // kiểu nguyên thủy
    int a = 10;
    int b = a;   // gán b = a

    System.out.println("Giá trị ban đầu:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    a = 20;  // thay đổi a

    System.out.println("\nSau khi thay đổi");
    System.out.println("a = " + a);
    System.out.println("b = " + b);  // b ko đổi vì chỉ copy giá trị


    // kiểu tham chiếu
    Student s1 = new Student("Nguyen Van A");
    Student s2 = s1;   // s2 tham chiếu cùng object với s1

    System.out.println("\nThông tin ban đầu:");
    System.out.println("Tên 1 = " + s1.name);
    System.out.println("Tên 2 = " + s2.name);

    s1.name = "user1";

    System.out.println("\nSau khi thay đổi");
    System.out.println("Tên 1 = " + s1.name);
    System.out.println("Tên 2 = " + s2.name);  // s2 cũng đổi


    }
}
