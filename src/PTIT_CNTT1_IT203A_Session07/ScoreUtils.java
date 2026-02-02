package PTIT_CNTT1_IT203A_Session07;

// bài 3
public class ScoreUtils {
    public  static boolean checkPass(double score){
        return score >= 5;
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;

        for (double s : scores) {
            sum += s;
        }
        return sum / scores.length;
    }
}
