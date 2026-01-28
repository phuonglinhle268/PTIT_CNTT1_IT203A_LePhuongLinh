package PTIT_CNTT1_IT203A_Session04;

public class session04_bai3 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};

        StringBuilder report = new StringBuilder();

        report.append("--- BÁO CÁO MƯỢN SÁCH ---\n");

        for (String t : transactions) {
            report.append("Giao dịch: ").append(t).append("\n");
        }
        System.out.println(report.toString());
    }
}

//Mỗi lần +=:
//Tạo object String mới
//Tốn bộ nhớ + chậm
// StringBuilder
//Chỉ 1 object
//Thay đổi trực tiếp nội dung