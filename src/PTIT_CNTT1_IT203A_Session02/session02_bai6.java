package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class session02_bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Integer là phiên bản “đối tượng” của kiểu int
//        int → kiểu dữ liệu nguyên thủy
//        Integer → lớp (class) đại diện cho số nguyên
//        dùng khi làm vc với object, cần gtri null

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        String[] days = {"Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7", "Chủ Nhật"};

        for (int i = 0; i < 7; i++) {
            System.out.print("Nhập lượt mượn ngày " + days[i] + ": ");
            int luotMuon = sc.nextInt();

            // thư viện đóng cửa
            if (luotMuon == 0) {
                continue;
            }
            sum += luotMuon;  // cộng dồn số lượt mượn ngày mở cửa
            count++;   // Đếm số ngày thư viện mở cửa


            if (luotMuon > max) {
                max = luotMuon;
            }
            if (luotMuon < min) {
                min = luotMuon;
            }
        }

        System.out.println("\n--- KẾT QUẢ THỐNG KÊ ---");
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Lượt mượn cao nhất: " + max);
            System.out.println("Lượt mượn thấp nhất: " + min);
            System.out.println("Trung bình lượt mượn/ngày: " + average);
        } else {
            System.out.println("Không có ngày nào mở cửa ");
        }

    }
}
