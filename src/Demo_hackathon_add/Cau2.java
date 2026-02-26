package Demo_hackathon_add;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
//        Phần 1: Loại bỏ các phần tử âm
//        Nhập mảng số nguyên gồm n phần tử.
//        Hãy xóa tất cả các số âm ra khỏi mảng bằng cách dồn các phần tử phía sau lên (shift left).
//                Không dùng mảng phụ.
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Nhập các phần tử của mảng
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int newSize = 0; // số phần tử còn lại sau khi xóa âm

        // Duyệt mảng và giữ lại số không âm
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }

        // In mảng đã lọc
        System.out.print("Mang sau khi loai cac so am: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Kich thuoc moi: " + newSize);

//        Phần 2: Đưa các số > 0 về bên trái, ≤ 0 về bên phải
//        Cho mảng arr n phần tử.
//        Hãy sắp xếp mảng sao cho:
//        Tất cả số > 0 nằm ở đầu mảng
//        Tất cả số ≤ 0 nằm ở cuối mảng
//        Không cần giữ thứ tự ban đầu.
//                Không dùng mảng phụ — chỉ swap trực tiếp

        // Nhập số lượng phần tử
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//
//        // Nhập các phần tử của mảng
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        int left = 0;
//        int right = n - 1;
//
//        // Thuật toán chia đôi vùng (partition)
//        while (left < right) {
//
//            // Nếu arr[left] > 0 → đúng vị trí
//            if (arr[left] > 0) {
//                left++;
//            }
//            // Nếu arr[right] <= 0 → đúng vị trí
//            else if (arr[right] <= 0) {
//                right--;
//            }
//            // Nếu sai vị trí → hoán đổi (swap)
//            else {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//        }
//
//        // In mảng sau khi phân tách
//        System.out.print("Mang sau khi sap xep: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}

//int n = scanner.nextInt();
//int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//arr[i] = scanner.nextInt();
//        }
//
//int pos = 0;  // vị trí sẽ đặt phần tử dương tiếp theo
//
//        for (int i = 0; i < n; i++) {
//        if (arr[i] > 0) {
//// Lấy ra giá trị dương
//int temp = arr[i];

//                for (int j = i; j > pos; j--) {
//arr[j] = arr[j - 1];
//        }
//
//// Đặt temp vào vị trí pos
//arr[pos] = temp;
//
//// Tăng vị trí đặt số dương
//pos++;
//        }
//        }
//
//        System.out.print("Mang sau khi sap xep (giu thu tu): ");
//        for (int i = 0; i < n; i++) {
//        System.out.print(arr[i] + " ");
//        }