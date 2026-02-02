package PTIT_CNTT1_IT203A_Session07;

public class session07_bai5 {
    public static void main(String[] args) {
        System.out.println("Điểm tối đa: " + Config.MAX_SCORE);
        System.out.println("Điểm tối thiểu: " + Config.MIN_SCORE);

        int score = 9;

        if (score <= Config.MAX_SCORE && score >= Config.MIN_SCORE) {
            System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm không hợp lệ");
        }

        // Thử thay đổi giá trị -> báo lỗi biên dịch
//        final
//        Giá trị chỉ được gán một lần duy nhất
//        Sau khi chương trình biên dịch, không ai có thể thay đổi giá trị đó
//        Mọi phần trong hệ thống phải sử dụng đúng giá trị cố định
//        => giúp tránh lỗi, tránh phá vỡ hệ thống.
//
//        Tên hằng số → viết IN HOA + gạch dưới
    }
}
