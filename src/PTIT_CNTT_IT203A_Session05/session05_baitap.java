package PTIT_CNTT_IT203A_Session05;

import java.util.*;

public class session05_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Two Sum");
            System.out.println("2. Move Zeroes");
            System.out.println("3. Valid Palindrome");
            System.out.println("4. Reverse Words");
            System.out.println("5. Happy Number");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    twoSum(sc);
                    break;
                case 2:
                    moveZeroes(sc);
                    break;
                case 3:
                    validPalindrome(sc);
                    break;
                case 4:
                    reverseWords(sc);
                    break;
                case 5:
                    happyNumber(sc);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

            System.out.println();
        } while (choice != 0);
    }

    // FR1
    static void twoSum(Scanner sc) {
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập target: ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Chỉ số: " + i + " và " + j);
                    return;
                }
            }
        }

        System.out.println("Không tìm thấy.");
    }

    // FR2
    // index = ghế trống đầu tiên
    //Gặp số khác 0 → cho nó ngồi vào ghế trống đó
    //Sau đó chuyển sang ghế trống tiếp theo
    //Khi hết số khác 0:
    //Những ghế còn lại → cho số 0 ngồi vào

    static void moveZeroes(Scanner sc) {
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        // ghi lại vị trí tiếp theo trong mảng mà một số khác 0 sẽ được đặt vào
        // = 0 thì bỏ qua
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
            //Nếu phần tử hiện tại khác 0 → đưa nó vào vị trí index,
            //rồi tăng index lên 1
            //ghi từ trái sang phải, theo đúng thứ tự gặp
        }
        while (index < n) { // n: số ptu, độ dài mảng
            arr[index++] = 0;
        }
        System.out.println("Mảng sau biến đổi: " + Arrays.toString(arr));
    }

    // FR3
    static void validPalindrome(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("False");
                return;
            }
            left++;
            right--;
        }

        System.out.println("True");
    }

    // FR4
    static void reverseWords(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) System.out.print(" ");
        }
        System.out.println();
    }

    // FR5
    static void happyNumber(Scanner sc) {
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;

            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }

            n = sum;
        }

        if (n == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}












//
//static void displayMSSV() {
//    if (size == 0) {
//        System.out.println("Danh sách MSSV đang rỗng!");
//        return;
//    }
//
//    System.out.println("\nDanh sách MSSV:");
//    for (int i = 0; i < size; i++) {
//        System.out.println((i + 1) + ". " + mssvList[i]);
//    }
//}
//
//// ================= THÊM =================
//static void addMSSV(Scanner scanner) {
//    if (size >= 100) {
//        System.out.println("Mảng đã đầy, không thể thêm!");
//        return;
//    }
//
//    String mssv;
//    while (true) {
//        System.out.print("Nhập MSSV mới: ");
//        mssv = scanner.nextLine();
//
//        if (Pattern.matches(MSSV_REGEX, mssv)) {
//            break;
//        } else {
//            System.out.println("MSSV không hợp lệ! (VD: B2101234)");
//        }
//    }
//
//    mssvList[size] = mssv;
//    size++;
//    System.out.println("Thêm MSSV thành công!");
//}
//
//// ================= CẬP NHẬT =================
//static void updateMSSV(Scanner scanner) {
//    if (size == 0) {
//        System.out.println("Danh sách rỗng, không thể cập nhật!");
//        return;
//    }
//
//    System.out.print("Nhập vị trí cần sửa (1 - " + size + "): ");
//    int index = scanner.nextInt();
//    scanner.nextLine(); // xử lý trôi
//
//    if (index < 1 || index > size) {
//        System.out.println("Vị trí không hợp lệ!");
//        return;
//    }
//
//    String newMSSV;
//    while (true) {
//        System.out.print("Nhập MSSV mới: ");
//        newMSSV = scanner.nextLine();
//
//        if (Pattern.matches(MSSV_REGEX, newMSSV)) {
//            break;
//        } else {
//            System.out.println("MSSV không hợp lệ! (VD: B2101234)");
//        }
//    }
//
//    mssvList[index - 1] = newMSSV;
//    System.out.println("Cập nhật MSSV thành công!");
//}
//
//// ================= XÓA (DỒN MẢNG) =================
//static void deleteMSSV(Scanner scanner) {
//    if (size == 0) {
//        System.out.println("Danh sách rỗng, không thể xóa!");
//        return;
//    }
//
//    System.out.print("Nhập MSSV cần xóa: ");
//    String target = scanner.nextLine();
//
//    int index = -1;
//    for (int i = 0; i < size; i++) {
//        if (mssvList[i].equalsIgnoreCase(target)) {
//            index = i;
//            break;
//        }
//    }
//
//    if (index == -1) {
//        System.out.println("Không tìm thấy MSSV cần xóa!");
//        return;
//    }
//
//    // Dồn mảng
//    for (int i = index; i < size - 1; i++) {
//        mssvList[i] = mssvList[i + 1];
//    }
//
//    mssvList[size - 1] = null;
//    size--;
//
//    System.out.println("Xóa MSSV thành công!");
//}