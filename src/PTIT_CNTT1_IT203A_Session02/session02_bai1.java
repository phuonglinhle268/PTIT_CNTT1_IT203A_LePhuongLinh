package PTIT_CNTT1_IT203A_Session02;

import java.util.Scanner;

public class session02_bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int age = sc.nextInt();
        System.out.print("Nhập số sách đang mượn: ");
        int amountBook = sc.nextInt();

        if(age >= 18 && amountBook <= 3){
            System.out.println("Kết quả: Bạn đủ tuổi mượn sách quý hiếm");
        } else {
            System.out.println("Không đủ điều kiện");

            if(amountBook > 3){
                System.out.println("Bạn đã muợn tối đa 3 quyển");
            } else if (age < 18) {
                System.out.println("Bạn phải đủ 18 tuổi trở lên");
            }
        }
    }
}
