package PTIT_CNTT1_IT203A_Session07;

public class session07_bai3 {
    public static void main(String[] args) {
        double[] scores = {9, 9.5, 10};

        System.out.print("Danh sách điểm: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nKết quả xử lý:");

        double avg = ScoreUtils.calculateAverage(scores);
        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", avg);

        for (double score : scores) {
            if (ScoreUtils.checkPass(score)) {
                System.out.println("- Điểm " + score + ": Đạt");
            } else {
                System.out.println("- Điểm " + score + ": Trượt");
            }
        }
    }
}
