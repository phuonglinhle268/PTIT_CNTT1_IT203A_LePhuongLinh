package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class session01_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD): ");
        double price = sc.nextDouble();
        System.out.print("Nhập tỉ giá (VNĐ/USD): ");
        float exchangeMoney = sc.nextFloat();

        double totalVND = price * exchangeMoney;

        long rounded = (long) totalVND;

        System.out.println("Giá làm tròn: " + rounded + " VNĐ");
    }
}
