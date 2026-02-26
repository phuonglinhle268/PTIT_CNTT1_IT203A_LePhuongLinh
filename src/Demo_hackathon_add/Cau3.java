package Demo_hackathon_add;

import java.util.Scanner;

public class Cau3 {
//    Chủ đề: Tìm phần tử xuất hiện đúng 1 lần trong hai mảng
//    Cho hai mảng số nguyên A và B.
//    Hãy tìm các phần tử chỉ xuất hiện trong một trong hai mảng
//    nhưng không xuất hiện trong mảng còn lại.
//    Mỗi giá trị chỉ in ra một lần.

    static boolean isExist(int[] array, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nA = scanner.nextInt();
        int[] A = new int[nA];

        for (int i = 0; i < nA; i++) {
            A[i] = scanner.nextInt();
        }

        int nB = scanner.nextInt();
        int[] B = new int[nB];

        for (int i = 0; i < nB; i++) {
            B[i] = scanner.nextInt();
        }

        int[] result = new int[nA];
        int resultSize = 0;

// Duyệt từng phần tử của A
        for (int i = 0; i < nA; i++) {
            int value = A[i];
            boolean foundInB = false;

            // Kiểm tra xem value có trong B không
            for (int j = 0; j < nB; j++) {
                if (B[j] == value) {
                    foundInB = true;
                    break;
                }
            }

            // Nếu không có trong B và chưa có trong result thì thêm vào
            if (!foundInB && !isExist(result, resultSize, value)) {
                result[resultSize] = value;
                resultSize++;
            }
        }

// In kết quả
        for (int i = 0; i < resultSize; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
