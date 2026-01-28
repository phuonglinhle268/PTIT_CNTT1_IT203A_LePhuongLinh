package PTIT_CNTT1_IT203A_Session04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class session04_bai6 {
    public static void main(String[] args) {

        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc. "
                + "Tôi cảm thấy thất vọng vì nội dung không có chiều sâu.";

        String[] blacklist = {"tệ", "ngu ngốc"};

        // Tạo regex từ blacklist
        // (?i) => không phân biệt hoa thường
        // join: Nối nhiều chuỗi lại thành MỘT chuỗi duy nhất, có ký tự phân cách ở giữa
        String regex = "(?i)\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);

        StringBuffer checkWord = new StringBuffer();
        while (matcher.find()) {
            int length = matcher.group().length();
            String replaceWord = "*".repeat(length);
            matcher.appendReplacement(checkWord, replaceWord);  //Phần vừa match → thay bằng dấu *
        }
        matcher.appendTail(checkWord);  // Ghép phần còn lại của chuỗi sau match cuối

        String result = checkWord.toString();
        // 2 phương thức append chỉ nhận StringBuffer

        // Cắt ngắn nếu quá 200 ký tự
        if (result.length() > 200) {
            int cutIndex = result.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(result.substring(0, cutIndex));
            sb.append("...");

            result = sb.toString();
        }
        System.out.print("Review sau khi xử lý: " + result);
    }
}
