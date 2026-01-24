package PTIT_CNTT1_IT203A_Session01;

public class session01_bai3 {
    public static void main(String[] args) {
        String book1= "Java Basic";
        String book2 = "Python Intro";
        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);

        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.println("Sau khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);
    }
}
//    Giải thích bộ nhớ:
//
//        - Các chuỗi "Java Basic" và "Python Intro" được lưu trong Heap
//        - book1, book2, temp là biến tham chiếu nằm trên Stack
//
//    Ban đầu:
//        book1 -> "Java Basic"
//        book2 -> "Python Intro"
//
//        Khi gán temp = book1: => temp -> "Java Basic"
//
//        Sau khi hoán đổi:
//         book1 -> "Python Intro"
//         book2 -> "Java Basic"
//
//        Nội dung String trong Heap KHÔNG đổi,
//        chỉ có các biến trên Stack đổi hướng tham chiếu
