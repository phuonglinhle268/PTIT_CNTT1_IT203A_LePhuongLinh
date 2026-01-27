package PTIT_CNTT1_IT203A_Session03;

import java.util.Arrays;

public class session03_bai6 {
    // gộp 2 mảng + lọc trùng
    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0;
        int[] temp = new int[a.length + b.length];    // Mảng tạm temp chứa kqua gộp
        int k = 0;  // vị trí, số phần tử hợp lệ ghi vào temp

        // Gộp khi cả hai mảng còn phần tử
        while (i < a.length && j < b.length) {
            // rỗng -> cho ptu đầu || !ptu ghi trc đó → cho vào
            // temp[k-1]: ptu vừa được thêm gần nhất
            if (a[i] < b[j]) {
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;  // xử lí xong lấy ptu của a, tiếp
            } else if (a[i] > b[j]) {
                if (k == 0 || temp[k - 1] != b[j]) {
                    temp[k++] = b[j];
                }
                j++;  // đx, lấy ptu của b
            } else {
                // a[i] == b[j] → trùng, chỉ ghi 1 lần
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
                j++;
            }
        }

        // Phần dư của mảng a
        // b hết a còn
        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

        // Phần dư của mảng b
        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

        //Arrays.copyOf(mangGoc, doDaiMoi): tạo một mảng mới bằng cách sao chép mảng cũ
        // Lấy từ temp[0] đến temp[k - 1]
        //Bỏ toàn bộ phần dư, trùng phía sau thành mảng mới hoàn chỉnh
        return Arrays.copyOf(temp, k);
    }

    // In mảng
    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        System.out.print("Kho cũ: ");
        display(arrayFirst);
        System.out.print("Lô mới: ");
        display(arraySecond);

        int[] merged = mergeBooks(arrayFirst, arraySecond);

        System.out.print("Kho tổng (đã gộp & lọc trùng): ");
        display(merged);
    }
}
