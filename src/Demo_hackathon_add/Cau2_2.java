package Demo_hackathon_add;

import java.util.Scanner;

public class Cau2_2 {
    public static void main(String[] args) {
//        Phần 1 – Xóa phần tử trùng lặp (giữ lần đầu)
//        Nhập mảng arr có n phần tử.
//        Xóa các phần tử trùng lặp, chỉ giữ lại lần xuất hiện đầu tiên.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

// Nhập các phần tử của mảng
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

// Mảng kết quả (kích thước tối đa n)
        int[] result = new int[n];
        int resultSize = 0;

// Xử lý loại bỏ trùng lặp
        for (int i = 0; i < n; i++) {
            boolean existed = false;

            // Kiểm tra xem phần tử arr[i] đã xuất hiện trước đó chưa
            for (int j = 0; j < resultSize; j++) {
                if (result[j] == arr[i]) {
                    existed = true;
                    break;
                }
            }

            // Nếu chưa xuất hiện thì thêm vào mảng result
            if (!existed) {
                result[resultSize] = arr[i];
                resultSize++;
            }
        }

// In ra mảng sau khi xóa trùng
        for (int i = 0; i < resultSize; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println();
        System.out.println("Kich thuoc moi: " + resultSize);

        //    Phần 2 – Tìm vị trí đầu tiên và cuối cùng của số x
//    Nhập mảng và giá trị x.
//    Tìm chỉ số xuất hiện đầu tiên và cuối cùng của x.
//    Nếu không có → in -1 -1.
        int x = scanner.nextInt();

        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        System.out.println(firstIndex + " " + lastIndex);
   }


}
