package PTIT_CNTT1_IT203A_Session05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class session05_kiemtra {
    public static String[] studentList = new String[100];
    public static int size = 0;
    public static String checkStudentID = "^B\\d{7}$";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Hiện danh sách sinh viên");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhập");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    displayStudent();
                    break;
                case 2:
                    addStudent(sc);
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    searchStudent(sc);
                    break;
                case 6:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
            System.out.println();
        }
        while (choice != 6);
    }

    // hiện danh sách
    public static void displayStudent(){
        if (size == 0) {
            System.out.println("Chưa có sinh viên");
            return;
        }

        System.out.println("Danh sách sinh viên: ");
        for (int i=0; i<size; i++){
            System.out.println((i + 1) + ". " + studentList[i]);
        }
    }

    //thêm
    public static void addStudent(Scanner sc){
        if (size >= 100) {
            System.out.println("Danh sách đã đầy");
            return;
        }

        String studentID;
        while(true){
            System.out.print("Nhập mã sinh viên mới: ");
            studentID = sc.nextLine();

            if (Pattern.matches(checkStudentID, studentID)){
                break;
            } else {
                System.out.println("Mã sinh viên không hợp lệ");
            }
        }
        studentList[size] = studentID;
        size++;
        System.out.println("Thêm mã sinh viên thành công");
    }

    //cập nhập
    public static void updateStudent(Scanner sc){
        System.out.print("Nhập vị trí cần sửa: ");

        int index = sc.nextInt();
        sc.nextLine();
        if (index < 1 || index > size){
            System.out.println("Vị trí không hợp lệ");
            return;
        }
        String newStudentID;
        while (true) {
            System.out.print("Nhập mã sinh viên mới: ");
            newStudentID = sc.nextLine();
        if (Pattern.matches(checkStudentID, newStudentID)) {
            break;
        } else {
            System.out.println("MSSV không hợp lệ");
        }
    }
        studentList[index - 1] = newStudentID;
        System.out.println("Cập nhật thành công");
    }

    // xóa
    public static void deleteStudent(Scanner sc) {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String target = sc.nextLine();

        int index = -1;
        for (int i = 0; i < size; i++) {
            if (studentList[i].equalsIgnoreCase(target)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không tìm thấy mã sinh viên cần xóa");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            studentList[i] = studentList[i + 1];
        }
        studentList[size - 1] = null;
        size--;
        System.out.println("Xóa thành công");
    }

    // tim kiem
    public static void searchStudent(Scanner sc){
        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = sc.nextLine().toLowerCase();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (studentList[i].toLowerCase().contains(keyword)) {
                System.out.println((i + 1) + ". " + studentList[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy mã sinh viên phù hợp");
        }
    }

}
