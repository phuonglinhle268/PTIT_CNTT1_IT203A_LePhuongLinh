package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class session02_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bookID;
        do {
            System.out.print("Nhập mã ID sách mới (lớn hơn 0): ");
            bookID = sc.nextInt();

            if (bookID <= 0){
                System.out.println("Mã không hợp lệ, hãy nhập lại");
            }
        }
        while (bookID <= 0);
//        Nếu id <= 0 (sai) → quay lại nhập tiếp
//        Khi id > 0 (đúng) → thoát vòng lặp

        System.out.println("Xác nhận: Mã sách " + bookID + " đã được ghi nhận");
    }
}
