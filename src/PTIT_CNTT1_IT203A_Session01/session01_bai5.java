package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class session01_bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        boolean isValid = (sumOfFirstThreeNumber % 10) == units;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + sumOfFirstThreeNumber);
        System.out.print("Kết quả kiểm tra mã sách: ");
        System.out.println(isValid ? "Hợp lệ" : "Sai mã");
    }
}
