package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class session02_bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diemUyTin = 100;
        int soNgayTre;

        System.out.println("--- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ---");
        System.out.println("(Nhập số ngày trễ, nhập 999 để kết thúc)");

        while(true){
            System.out.print("Số ngày trễ lần này: ");
            soNgayTre = sc.nextInt();

            if (soNgayTre == 999){
                break;
            }
            if (soNgayTre <= 0){
                diemUyTin += 5;
                System.out.println("-> Trả đúng hạn: +5 điểm");
            } else {
                int truDiem = soNgayTre * 2;
                diemUyTin -= truDiem;
                System.out.println("-> Trả trễ " + soNgayTre + " ngày: -" + truDiem + " điểm.");
            }
        }
        System.out.println("Tổng điểm uy tín: " + diemUyTin);

        if (diemUyTin > 120) {
            System.out.println("Xếp loại: ĐỘC GIẢ THÂN THIẾT");
        } else if (diemUyTin >= 80) {
            System.out.println("Xếp loại: ĐỘC GIẢ TIÊU CHUẨN");
        } else {
            System.out.println("Xếp loại: ĐỘC GIẢ CẦN LƯU Ý");
        }
    }
}
