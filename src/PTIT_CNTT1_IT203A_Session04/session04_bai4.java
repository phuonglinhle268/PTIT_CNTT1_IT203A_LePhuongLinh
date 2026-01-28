package PTIT_CNTT1_IT203A_Session04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class session04_bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thẻ: ");
        String cardID = sc.nextLine();

        Pattern fullCard = Pattern.compile("^TV\\d{4}\\d{5}$");
        Pattern prefix = Pattern.compile("^TV");
        Pattern year = Pattern.compile("^TV\\d{4}");
        Pattern number = Pattern.compile("^TV\\d{4}\\d{5}$");

        if (!prefix.matcher(cardID).find()) {
            System.out.println("Thiếu tiền tố TV");
        }
        else if (!year.matcher(cardID).find()) {
            System.out.println("Năm không hợp lệ");
        }
        else if (!fullCard.matcher(cardID).matches()) {
            System.out.println("5 chữ số cuối không hợp lệ");
        }
        else {
            System.out.println("Mã thẻ hợp lệ");
        }
    }
}
