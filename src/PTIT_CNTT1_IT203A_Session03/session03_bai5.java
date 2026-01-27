package PTIT_CNTT1_IT203A_Session03;


import java.util.Scanner;

public class session03_bai5 {

    // Xóa bookId, trả về số lượng sách mới
    public static int deleteBook(int[] arr, int n, int bookId) {
        int k = -1;
        // k: lưu vị trí tìm thấy bookId
        // -1: đánh dấu trạng thái chưa tìm thấy phần tử cần xóa

        // Tìm vị trí sách cần xóa
        // duyệt từ đầu->cuối
        // So sánh phần tử tại vị trí i với mã sách cần xóa
        // Ghi lại vị trí (index) tìm được
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                k = i;
                break;
            }
        }

        if (k == -1) {
            System.out.println("Không tìm thấy sách mã " + bookId);
            return n;
        }

        // Dồn trái các phần tử phía sau
        for (int i = k; i < n - 1; i++) {
            arr[i] = arr[i + 1];   // Ghi đè phần tử phía sau lên phần tử hiện tại
        }

        System.out.println("Đã xóa sách mã " + bookId);
        return n - 1;
    }

    // chỉ in n phần tử
    public static void displayBooks(int[] arr, int n) {
        System.out.print("Kho sách hiện tại (" + n + " cuốn): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        while (n > 0) {
            displayBooks(books, n);

            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int bookId = sc.nextInt();

            if (bookId == 0) {
                break;
            }
            n = deleteBook(books, n, bookId);
        }
    }
}
