package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class session02_bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        int total = 0;   //tổng số tiền phạt của các cuốn

        // vòng lặp cho mỗi cuốn sách.
        // mỗi lần lặp thì tính tiền phạt của cuốn đó và cộng dồn vào total

        for (int i = 1; i <= n; i++){   // i: số cuốn
            System.out.print("Nhập số ngày trễ của cuốn sách thứ " + i +": ");
            int lateDay = sc.nextInt();
            total += lateDay * 5000;
        }
        System.out.println("==> Tổng tiền phạt: " + total + " VND");
    }
}

//đặt total ngoài for thì sẽ chỉ tính tiền cho lần gán gtri cuối (1 lần)