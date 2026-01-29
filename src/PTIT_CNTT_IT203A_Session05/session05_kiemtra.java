package PTIT_CNTT_IT203A_Session05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class session05_kiemtra {
    static String[] studentList = new String[100];
    static int size = 0;
    static String checkStudentID = "^B\\d{7}$";


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

            choice = sc.nextInt();
            switch (choice){
                case 1:
                    displayStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                case 4:
                    //deleteStudent();
                    break;
                case 5:
                    searchStudent();
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
        System.out.println("Danh sách sinh viên: ");
        for (int i=0; i<size; i++){
            System.out.println(i+1);
        }
    }

    public static void addStudent(Scanner sc){
        String studentID;
        while(true){
            System.out.println("Nhập mã sinh viên mới: ");
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

    public static void updateStudent(Scanner sc){
        System.out.print("Nhập vị trí cần sửa: ");

        int index = sc.nextInt();
        if (index < 1 || index > size){
            System.out.println("Vị trí không hợp lệ");
            return;
        }
        String newStudentID;
        System.out.println("Nhập mã sinh viên mới: ");
        newStudentID = sc.nextLine();

        if (Pattern.matches(checkStudentID, newStudentID)){

            return;
        } else{
            System.out.println("Mã sinh viên không hợp lệ");
        }
        studentList[size - 1] = newStudentID;
        size--;
        System.out.println("Cập nhật thành công");
    }

    public static void searchStudent(){

    }
}
