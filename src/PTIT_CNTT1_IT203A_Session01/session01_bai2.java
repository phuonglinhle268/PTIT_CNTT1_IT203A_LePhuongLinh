package PTIT_CNTT1_IT203A_Session01;

import java.util.Scanner;

public class session01_bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: ");
        int n = sc.nextInt();
        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        double firstFine = n * m * 5000;
        double finalFine = firstFine;

        if (n>7 && m>=3){
            finalFine = firstFine * 1.2;
        }

        boolean blockCard = finalFine > 50000;

        System.out.println("\nTiền phạt gốc: " + firstFine + " VNĐ");
        System.out.println("Tiền phạt sau điều chỉnh: " + finalFine + " VNĐ");
        System.out.println("Yêu cầu khóa thẻ: " + blockCard);
    }
}
