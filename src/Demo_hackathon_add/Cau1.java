package Demo_hackathon_add;

import java.util.Scanner;

public class Cau1 {
//    Phần 1: Tách chữ cái thành chữ hoa và chữ thường
//    Nhập vào một chuỗi bất kỳ
//    Một chuỗi chứa tất cả chữ in hoa (A–Z)
//    Một chuỗi chứa tất cả chữ in thường (a–z)
//    Bỏ qua hoàn toàn số, dấu cách và ký tự đặc biệt.
//    Chữ cái in ra phải giữ nguyên dạng ban đầu (hoa vẫn hoa, thường vẫn thường).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Nhập chuỗi
        String input = scanner.nextLine();

// Khai báo 2 chuỗi kết quả
        String uppercaseLetters = "";
        String lowercaseLetters = "";

// Duyệt qua từng ký tự
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Nếu là chữ in hoa
            if (Character.isUpperCase(c)) {
                uppercaseLetters += c + " ";
            }

            // Nếu là chữ in thường
            if (Character.isLowerCase(c)) {
                lowercaseLetters += c + " ";
            }
        }

// In kết quả
        System.out.println("Uppercase: " + uppercaseLetters);
        System.out.println("Lowercase: " + lowercaseLetters);


//    Phần 2: Tìm từ dài nhất trong chuỗi
//    Nhập vào một chuỗi văn bản.
//    Hãy tìm từ dài nhất trong chuỗi
//    Nếu có nhiều từ cùng độ dài, in ra từ xuất hiện đầu tiên.
//    Từ được định nghĩa là các ký tự liên tiếp không chứa khoảng trắng.
        String text = scanner.nextLine();

        int maxLength = 0;
        int currentLength = 0;

// Duyệt chuỗi
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                // Nếu là chữ cái, tăng độ dài đoạn hiện tại
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                // Nếu gặp ký tự không phải chữ cái -> reset
                currentLength = 0;
            }
        }

// In kết quả
        System.out.println(maxLength);
    }

}
