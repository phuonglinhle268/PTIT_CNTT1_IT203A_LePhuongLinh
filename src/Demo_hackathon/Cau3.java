package Demo_hackathon;

import java.util.Scanner;

public class Cau3 {
    //    Câu 3: Tư duy Thuật toán nâng cao
//        Chủ đề: Giao của hai tập hợp mảng (Intersection)
//        Cho hai mảng số nguyên A (n phần tử) và B (m phần tử)
//        Tìm các phần tử xuất hiện ở CẢ HAI mảng A và B
//        Mỗi giá trị chung chỉ được in ra một lần duy nhất
//        không dùng các cấutrúc dữ liệu đặc biệt (Set, Map), Sort

    static boolean isExist(int[] arr, int size, int value){
        for (int i=0; i < size; i++){
            if (arr[i] == value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA = scanner.nextInt();  // nếu ko cần input
        int[] A = new int[numberA];
        for (int i=0; i < numberA; i++){
            A[i] = scanner.nextInt();
        }

        int numberB = scanner.nextInt();
        int[] B = new int[numberB];
        for (int i=0; i < numberB; i++){
            B[i] = scanner.nextInt();
        }

        int[] result = new int[Math.min(numberA, numberB)];
        int size = 0;

        for (int i=0; i < numberA; i++){
            int v = A[i];

            boolean foundInB = false;
            for (int j=0; j < numberB; j++){
                if (B[j] == v){
                    foundInB = true;
                    break;
                }
            }
            if (foundInB && !isExist(result, size, v)){
                result[size++] = v;
            }
        }
        for (int i=0; i < size; i++){
            System.out.print(result[i] + " ");
        }
    }
}

// sau scanner
//// ===== INPUT MẢNG A =====
//        System.out.print("Nhập số phần tử của A: ");
//int n = sc.nextInt();
//
//int[] A = new int[n];
//        System.out.println("Nhập các phần tử của A:");
//        for (int i = 0; i < n; i++) {
//A[i] = sc.nextInt();
//        }
//
//                // ===== INPUT MẢNG B =====
//                System.out.print("Nhập số phần tử của B: ");
//int m = sc.nextInt();
//
//int[] B = new int[m];
//        System.out.println("Nhập các phần tử của B:");
//        for (int i = 0; i < m; i++) {
//B[i] = sc.nextInt();
//        }
//
//// ===== TÌM GIAO =====
//int[] result = new int[Math.min(n, m)];
//int k = 0;
//
//        for (int i = 0; i < n; i++) {
//int x = A[i];
//
//// kiểm tra x có trong B không
//boolean foundInB = false;
//            for (int j = 0; j < m; j++) {
//        if (B[j] == x) {
//foundInB = true;
//        break;
//        }
//        }
//
//        // nếu x có trong B và chưa có trong result
//        if (foundInB && !isExist(result, k, x)) {
//result[k++] = x;
//            }
//                    }
//
//                    // ===== OUTPUT =====
//                    System.out.print("Kết quả giao: ");
//        for (int i = 0; i < k; i++) {
//        System.out.print(result[i] + " ");
//        }
//                }