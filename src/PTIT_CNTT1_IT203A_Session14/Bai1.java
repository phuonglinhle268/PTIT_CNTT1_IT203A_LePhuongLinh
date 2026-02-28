package PTIT_CNTT1_IT203A_Session14;

import java.util.LinkedHashSet;
import java.util.Set;

public class Bai1 {
    public static void main(String[] args) {
        String[] patients = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };

        Set<String> patientList = new LinkedHashSet<>();  // giữ thứ tự chèn, ko trùng
        for (String patientName : patients){
            patientList.add(patientName);
        }
        System.out.println("Danh sách");
        for (String p : patientList){
            System.out.println(p);
        }
    }
}
