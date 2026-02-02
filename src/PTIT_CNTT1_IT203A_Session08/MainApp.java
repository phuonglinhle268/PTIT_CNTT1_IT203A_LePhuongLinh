package PTIT_CNTT1_IT203A_Session08;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(100);

        while (true) {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Cập nhật thông tin");
            System.out.println("5. Xóa sinh viên");
            System.out.println("6. Tính điểm trung bình và xếp loại");
            System.out.println("7. Sắp xếp");
            System.out.println("8. Thống kê");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: manager.themSV(sc); break;
                case 2: manager.displayStudentList(); break;

                case 3:
                    System.out.print("Nhập mã hoặc tên: ");
                    String key = sc.nextLine();

                    Student sv = manager.timTheoMa(key);
                    if (sv != null) sv.studentInfo();
                    else manager.timTheoTen(key);
                    break;

                case 4: manager.capNhat(sc); break;
                case 5: manager.xoaSV(sc); break;
                case 6: manager.tinhDiem(sc); break;

                case 7:
                    System.out.println("1. Theo điểm TB");
                    System.out.println("2. Theo tên A-Z");
                    int c = Integer.parseInt(sc.nextLine());
                    if (c == 1) manager.sapXepTheoDiem();
                    else manager.sapXepTheoTen();
                    break;

                case 8: manager.thongKe(); break;

                case 9:
                    System.out.println("Thoát");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}