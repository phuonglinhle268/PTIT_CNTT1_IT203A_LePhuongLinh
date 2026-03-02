package PTIT_CNTT1_IT203A_Session15.Bai3;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] case1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(case1); // Hợp lệ

        String[] case2 = {"POP", "PUSH"};
        checker.checkProcess(case2); // Lỗi: POP khi rỗng

        String[] case3 = {"PUSH", "PUSH", "POP"};
        checker.checkProcess(case3); // Lỗi: cuối ca Stack không rỗng
    }
}
