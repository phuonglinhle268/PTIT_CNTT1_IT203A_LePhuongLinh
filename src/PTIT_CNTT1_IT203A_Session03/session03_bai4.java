package PTIT_CNTT1_IT203A_Session03;

import java.util.Arrays;

public class session03_bai4 {
    // tăng dần
//    So sánh 2 phần tử kề nhau
//    Nếu đứng trước > đứng sau → đổi chỗ
//    Lặp lại nhiều vòng cho đến khi mảng được sắp xếp
//   -> Phần tử lớn nhất “nổi” dần về cuối mảng sau mỗi vòng.
    static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void displayBooks(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] books = {105, 102, 109, 101, 103};

        System.out.print("Trước khi sắp xếp: ");
        displayBooks(books);

        sortBooks(books);

        System.out.print("Sau khi sắp xếp:   ");
        displayBooks(books);
    }
}
