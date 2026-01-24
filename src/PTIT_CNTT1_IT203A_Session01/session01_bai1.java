package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class session01_bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();
        System.out.print("Nhập giá sách: ");
        double price = sc.nextDouble();
        System.out.print("Sách còn trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        int bookAge = 2026 - publishYear;
        String status = isAvailable ? "Còn sách" : "Đã mượn";

        System.out.println("\n===== PHIẾU THÔNG TIN SÁCH =====");
        System.out.println("Mã sách      : " + bookID);
        System.out.println("Tên sách     : " + bookName);
        System.out.println("Năm xuất bản   : " + publishYear);
        System.out.println("Tuổi thọ: " + bookAge + " năm");
        System.out.printf("Giá bán    : %.2f\n", price);
        System.out.println("Tình trạng     : " + status);
        ;
    }
}
