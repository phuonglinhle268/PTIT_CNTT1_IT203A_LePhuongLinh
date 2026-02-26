package Demo_hackathon;

import PTIT_CNTT1_IT203A_Session07.ScoreUtils;

import java.util.Scanner;

// nếu tách thì p2 làm sau Scanncer sc

public class Cau1 {
    public static void main(String[] args) {
//        PHẦN 1: phân loại & tách nhóm kí tự
//        Nhập vào một chuỗi hỗn hợp bất kỳ.
//        Hãy lọc ra tất cả các "chữ cái", chia thành 2 chuỗi riêng biệt:
//        một chuỗi chỉ chứa Nguyên âm (u, e, o, a, i - không phân biệt hoa thường)
//        một chuỗi chứa các Phụ âm còn lại. Các chữ cái in ra phải được viết thường
//        Bỏ qua hoàn toàn số và ký tự đặc biệt
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String vowel = "";
        String consonant = "";

        for (int i=0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));

            if (Character.isLetter(c)){
                if ("ueoai".indexOf(c) != -1){
                    vowel += c;
                } else {
                    consonant += c;
                }
            }
        }
        System.out.println("Nguyên âm: " + vowel);
        System.out.println("Phụ âm: " + consonant);

//        System.out.println("Nhập vào một chuỗi bất kỳ: ");
//        String s = scanner.nextLine();
//
//        String vowel = "";
//        String consonant = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = Character.toLowerCase(s.charAt(i));
//
//            if (Character.isLetter(c)) {
//                if ("ueoai".indexOf(c) != -1) {
//                    vowel += c;
//                } else {
//                    consonant += c;
//                }
//            }
//        }
//
//        System.out.println("Nguyên âm: " + vowel);
//        System.out.println("Phụ âm: " + consonant);


//        PHẦN 2: kí tự xuất hiện max
//        Nhập vào một chuỗi văn bản.
//        tìm, in ra ký tự chữ cái xuất hiện nhiều nhất trong chuỗi cùng với số lần xuất hiện
//                (không phân biệt chữ hoa/chữ thường)
//        Nếu có nhiều ký tự có cùng số lần xuất hiện nhiều nhất, in ra ký tự xuất hiện đầu tiên.
//                Bỏ qua khoảng trắng
        String text = scanner.nextLine();
        int[] freq = new int[256];

        for (int i=0; i < text.length(); i++){
            char c = Character.toLowerCase(text.charAt(i));

            if (Character.isLetter(c)){
                freq[c]++;
            }
        }

        int maxFreq = 0;
        char resultChar = 0;

        for (int i=0; i < text.length(); i++){
            char c = Character.toLowerCase(text.charAt(i));

            if (Character.isLetter(c)){
                if (freq[c] > maxFreq){
                    maxFreq = freq[c];
                    resultChar = c;
                }
            }
        }
        System.out.println(resultChar + " (xuất hiện " + maxFreq + " lần)");
    }
}
//System.out.println("Nhập vào một chuỗi văn bản: ");
//String text = scanner.nextLine();
//
//int[] freq = new int[256];
//
//// Đếm tần suất
//        for (int i = 0; i < text.length(); i++) {
//char c = Character.toLowerCase(text.charAt(i));
//
//            if (Character.isLetter(c)) {
//freq[c]++;
//        }
//        }
//
//int maxFreq = 0;
//char resultChar = 0;
//
//// Tìm ký tự xuất hiện đầu tiên có tần suất lớn nhất
//        for (int i = 0; i < text.length(); i++) {
//char c = Character.toLowerCase(text.charAt(i));
//
//            if (Character.isLetter(c)) {
//        if (freq[c] > maxFreq) {
//maxFreq = freq[c];
//resultChar = c;
//                }
//                        }
//                        }
//
//                        System.out.println(resultChar + " (xuất hiện " + maxFreq + " lần)");
//    }


// min
//String text = scanner.nextLine();
//int[] freq = new int[256];
//
//// Đếm tần suất
//for (int i = 0; i < text.length(); i++) {
//char c = Character.toLowerCase(text.charAt(i));
//
//    if (Character.isLetter(c)) {
//freq[c]++;
//        }
//        }
//
//// Tìm ký tự xuất hiện ít nhất
//int minFreq = Integer.MAX_VALUE;
//char resultChar = 0;
//
//// Duyệt theo thứ tự xuất hiện
//for (int i = 0; i < text.length(); i++) {
//char c = Character.toLowerCase(text.charAt(i));
//
//    if (Character.isLetter(c)) {
//        if (freq[c] < minFreq) {
//minFreq = freq[c];
//resultChar = c;
//        }
//                }
//                }
//
//                System.out.println(resultChar + " (xuất hiện " + minFreq + " lần)");