package Demo_hackathon_add;

public class Cau2_3 {
//    Phần 1 – Xóa phần tử x
//   Cho mảng arr n phần tử và một số x.
//    Hãy xóa tất cả phần tử bằng x và dồn mảng sang trái.
//    int n = scanner.nextInt();
//    int[] arr = new int[n];
//
//for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
//
//    int x = scanner.nextInt();
//
//    int k = 0; // vị trí ghi
//
//for (int i = 0; i < n; i++) {
//        if (arr[i] != x) {
//            arr[k] = arr[i];
//            k++;
//        }
//    }
//
//for (int i = 0; i < k; i++) {
//        System.out.print(arr[i] + " ");
//    }
//System.out.println("\nKích thước mới: " + k);

//    Phần 2 – Tách dương & không dương (giữ thứ tự)
//    Không dùng mảng phụ – cách đơn giản nhất
//    int[] arr = {3, -1, 0, 2, -5, 4};
//
//    int n = arr.length;
//    int k = 0;
//
//// Ghi các số dương lên đầu mảng
//for (int i = 0; i < n; i++) {
//        if (arr[i] > 0) {
//            arr[k] = arr[i];
//            k++;
//        }
//    }
//
//// Ghi tiếp các số ≤ 0
//for (int i = 0; i < n; i++) {
//        if (arr[i] <= 0) {
//            arr[k] = arr[i];
//            k++;
//        }
//    }
//
//for (int i = 0; i < n; i++) {
//        System.out.print(arr[i] + " ");
//    }

    // ko cần giữ tt ban đầu
//int n = arr.length;
//
//    int left = 0;         // sẽ tìm số ≤ 0
//    int right = n - 1;    // sẽ tìm số > 0
//
//while (left < right) {
//
//        // Tìm vị trí bên trái có số ≤ 0 (sai vị trí)
//        while (left < right && arr[left] > 0) {
//            left++;
//        }
//
//        // Tìm vị trí bên phải có số > 0 (sai vị trí)
//        while (left < right && arr[right] <= 0) {
//            right--;
//        }
//
//        // Swap 2 thằng sai vị trí
//        if (left < right) {
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//        }
//    }
}
