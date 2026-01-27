package PTIT_CNTT1_IT203A_Session03;

import java.util.Scanner;

public class session03_bai2 {
    public static int searchBooks(String[] arr, String search){
        for (int i=0; i <arr.length; i++){
            if (arr[i].equalsIgnoreCase(search)){   //Ss 2 chuỗi không phân biệt chữ hoa/thường.
                return i;
            }
        }
        return -1;  // ko tìm thấy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // danh sách sẵn
        String[] books = {"Doraemon", "Nhà giả kim", "Tí quậy", "Harry Potter", "Conan"};

        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int index = searchBooks(books, search);

        if (index != -1){
            System.out.println("Tìm thấy sách "+ search + " tại vị trí: "+index);
        } else {
            System.out.println("Sách không tồn tại trong thư viện");
        }
    }
}
