package Demo_hackathon;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Phần 1: Delete & Shift Left
//        Cho mảng arr có n phần tử
//        Nhập một gtri x
//        xóa tất cả các phần tử có giá trị bằng x ra khỏi mảng
//        bằng cách dịch các phần tử phía sau lên trước (dồn mảng sangtrái)
//        In mảng sau khi xóa và kích thước mảng mới
//        Không dùng mảng phụ

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i=0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();

        int k = 0;
        for (int i=0; i<n; i++){
            if (arr[i] != x){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println("Mảng sau khi xóa: ");
        for (int i=0; i < k; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("Kích thước mới: " + k);

//        System.out.print("Nhập số phần tử n: ");
//        int n = scanner.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Nhập các phần tử của mảng:");
//        for (int i = 0; i < n; i++) {
//            System.out.print( i+1 + "= ");
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.print("Nhập giá trị cần xóa x: ");
//        int x = scanner.nextInt();
//
//        int k = 0; // số phần tử sau khi xóa
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != x) {
//                arr[k] = arr[i];
//                k++;
//            }
//        }
//
//        System.out.print("Mảng sau khi xóa: ");
//        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("Kích thước mới: " + k);
//    }

//        Phần 2: Phân tách Chẵn - Lẻ
//        Cho mảng arr gồm n phần tử nguyên
//        sắp xếp số chẵn nằm ở nửa đầu mảng, lẻ nằm ở nửa cuối
//        Thực hiện đổi chỗ trực tiếp trên mảng (swap)
//        không dùng mảng phụ, quan tâm đến thứ tự ban đầu của các số
        int m = scanner.nextInt();
        int[] arr2 = new int[m];

        for (int i=0; i < m; i++){
            arr2[i] = scanner.nextInt();
        }
        int left = 0, right = m-1;

        while (left < right){
            if (arr2[left] % 2 == 0){
                left++;
            } else if (arr2[right] % 2 != 0) {
                right--;
            } else {
                int temp = arr2[left];
                arr2[left] = arr2[right];
                arr2[right] = temp;
            }
        }
        System.out.print("Mảng mới: ");
        for (int i=0; i < m; i++){
            System.out.print(arr2[i] + " ");
            System.out.println();
        }
    }
}
//System.out.print("Nhập số phần tử m: ");
//int m = scanner.nextInt();
//
//int[] arr = new int[m];
//
//        System.out.println("Nhập các phần tử của mảng:");
//        for (int i = 0; i < m; i++) {
//        System.out.print("arr[" + i + "] = ");
//arr[i] = scanner.nextInt();
//        }
//
//int left = 0;
//int right = m - 1;
//
//        while (left < right) {
//        if (arr[left] % 2 == 0) {
//left++;
//        } else if (arr[right] % 2 != 0) {
//right--;
//        } else {
//int temp = arr[left];
//arr[left] = arr[right];
//arr[right] = temp;
//            }
//                    }
//
//                    System.out.print("Mảng mới sau khi tách chẵn - lẻ: ");
//        for (int i = 0; i < m; i++) {
//        System.out.print(arr[i] + " ");
//        }
//                }