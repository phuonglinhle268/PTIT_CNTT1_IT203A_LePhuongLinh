package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class session01_bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int number = sc.nextInt();

        int bookShelf = (number - 1)/25 + 1;
        int position = (number - 1) % 25 + 1;
        String area = (bookShelf <= 10) ? "Khu cận (gần cửa)" : "Khu viễn";

        System.out.println();
        System.out.println("--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + number);
        System.out.println("Địa chỉ: Kệ " + bookShelf + " - Vị trí " + position);
        System.out.println("Phân khu: " + area);
    }
}
