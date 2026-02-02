package PTIT_CNTT1_IT203A_Session08;

import java.util.Scanner;

public class StudentManager {
    private Student[] list;
    private int size;

    public StudentManager(int capacity) {
        list = new Student[capacity];
        size = 0;
    }

    // FR1: thêm sinh viên
    public void themSV(Scanner sc) {
        if (size == list.length) {
            System.out.println("Danh sách đã đầy!");
            return;
        }

        System.out.print("Mã SV: ");
        String ma = sc.nextLine();

        // check trùng mã
        if (timTheoMa(ma) != null) {
            System.out.println("Mã sinh viên đã tồn tại!");
            return;
        }

        System.out.print("Họ tên: ");
        String ten = sc.nextLine();

        System.out.print("Tuổi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        if (tuoi < 18 || tuoi > 30) {
            System.out.println("Tuổi không hợp lệ!");
            return;
        }

        System.out.print("Giới tính: ");
        String gt = sc.nextLine();

        System.out.print("Điểm Toán: ");
        double t = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm Lý: ");
        double l = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm Hóa: ");
        double h = Double.parseDouble(sc.nextLine());

        list[size++] = new Student(ma, ten, tuoi, gt, t, l, h);
        System.out.println("✓ Thêm thành công!");
    }

    // FR2: hiển thị
    public void displayStudentList() {
        if (size == 0) {
            System.out.println("Chưa có sinh viên");
            return;
        }

        System.out.printf("%-10s %-17s %-7s %-10s %-15s %-15s\n",
                "Mã SV", "Họ tên", "Tuổi", "Giới tính", "ĐTB", "Xếp loại");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < size; i++) {
            list[i].studentInfo();
        }
    }

    // FR3: tìm theo mã
    public Student timTheoMa(String maSV) {
        for (int i = 0; i < size; i++) {
            if (list[i].getMaSV().equalsIgnoreCase(maSV)) {
                return list[i];
            }
        }
        return null;
    }

    // FR3: tìm theo tên mờ
    public void timTheoTen(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (list[i].getHoTen().toLowerCase().contains(keyword.toLowerCase())) {
                list[i].studentInfo();
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy!");
    }

    // FR4: cập nhật
    public void capNhat(Scanner sc) {
        System.out.print("Nhập mã SV cần cập nhật: ");
        String ma = sc.nextLine();

        Student sv = timTheoMa(ma);
        if (sv == null) {
            System.out.println("Không tìm thấy!");
            return;
        }

        System.out.print("Tên mới: ");
        sv.setHoTen(sc.nextLine());

        System.out.print("Tuổi mới: ");
        sv.setTuoi(Integer.parseInt(sc.nextLine()));

        System.out.print("Điểm Toán mới: ");
        sv.setDiemToan(Double.parseDouble(sc.nextLine()));

        System.out.print("Điểm Lý mới: ");
        sv.setDiemLy(Double.parseDouble(sc.nextLine()));

        System.out.print("Điểm Hóa mới: ");
        sv.setDiemHoa(Double.parseDouble(sc.nextLine()));

        sv.tinhDiemTB();
        sv.xepLoai();

        System.out.println("✓ Cập nhật thành công!");
    }

    // FR5: xóa sinh viên
    public void xoaSV(Scanner sc) {
        System.out.print("Nhập mã SV cần xóa: ");
        String ma = sc.nextLine();

        for (int i = 0; i < size; i++) {
            if (list[i].getMaSV().equalsIgnoreCase(ma)) {
                for (int j = i; j < size - 1; j++) {
                    list[j] = list[j + 1];
                }
                size--;
                System.out.println("✓ Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy!");
    }

    // FR6: tính điểm TB + xếp loại
    public void tinhDiem(Scanner sc) {
        System.out.print("Nhập mã SV: ");
        String ma = sc.nextLine();

        Student sv = timTheoMa(ma);
        if (sv == null) {
            System.out.println("Không tìm thấy!");
            return;
        }

        System.out.println("ĐTB: " + sv.getDiemTB());
        System.out.println("Xếp loại: " + sv.getXepLoai());
    }

    // FR7: sắp xếp theo điểm giảm dần (bubble sort)
    public void sapXepTheoDiem() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (list[j].getDiemTB() < list[j + 1].getDiemTB()) {
                    Student tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
        System.out.println("✓ Đã sắp xếp theo điểm giảm dần!");
    }

    // FR7: sắp xếp theo tên A-Z (selection sort)
    public void sapXepTheoTen() {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (list[j].getHoTen().compareToIgnoreCase(list[min].getHoTen()) < 0) {
                    min = j;
                }
            }
            Student tmp = list[i];
            list[i] = list[min];
            list[min] = tmp;
        }
        System.out.println("✓ Đã sắp xếp theo tên A-Z!");
    }

    // FR8: thống kê
    public void thongKe() {
        int g = 0, k = 0, tb = 0, y = 0;
        double max = -1, min = 11, total = 0;

        for (int i = 0; i < size; i++) {
            Student s = list[i];
            total += s.getDiemTB();

            switch (s.getXepLoai()) {
                case "Giỏi": g++; break;
                case "Khá": k++; break;
                case "Trung bình": tb++; break;
                default: y++;
            }

            if (s.getDiemTB() > max) max = s.getDiemTB();
            if (s.getDiemTB() < min) min = s.getDiemTB();
        }

        System.out.println("Giỏi: " + g);
        System.out.println("Khá: " + k);
        System.out.println("Trung bình: " + tb);
        System.out.println("Yếu: " + y);

        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhất: " + min);
        System.out.println("Điểm TB chung: " + (total / size));
    }
}

