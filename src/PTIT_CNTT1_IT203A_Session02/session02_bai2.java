package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class session02_bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khu vực (A,B,C,D): ");
        char code = sc.next().charAt(0);
//        nhận chuỗi từ next và lấy kí tự với index đầu

        switch (code) {
            case 'A':
                System.out.println("Vị trí: Tầng 1 - Sách Văn học");
                break;
            case 'B':
                System.out.println("Vị trí: Tầng 2 - Sách Khoa hoc");
                break;
            case 'C':
                System.out.println("Vị trí: Tầng 3 - Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.println("Vị trí: Tầng 4 - Sách Tin học");
                break;
            default:
                System.out.println("Lỗi: Mã khu vực không hợp lệ!");
        }

    }
}
