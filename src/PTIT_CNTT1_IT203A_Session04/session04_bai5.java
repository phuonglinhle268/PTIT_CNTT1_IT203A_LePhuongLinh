package PTIT_CNTT1_IT203A_Session04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class session04_bai5 {
    public static void main(String[] args) {
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK23456"
        };
        String regex =
                "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (BORROW|RETURN) \\| BookID: (\\w+)";

        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            if (matcher.find()) {
                // group(0) Toàn bộ chuỗi (log) match
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                System.out.println("Ngày: " + date);
                System.out.println("Người dùng: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookId);
                System.out.println();

                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            }
        }
        System.out.println("Lượt mượn: " + borrowCount);
        System.out.println("Lượt trả: " + returnCount);
    }
}
