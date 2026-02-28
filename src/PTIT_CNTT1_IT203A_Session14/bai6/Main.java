package PTIT_CNTT1_IT203A_Session14.bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Patient> patientList = List.of(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 28, "Tim mạch"),
                new Patient("Bình", 60, "Nội tiết"),
                new Patient("Tuấn", 50, "Thần kinh")
        );
        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patientList){
            departmentMap.computeIfAbsent(p.department, k -> new ArrayList<>()).add(p);
        }
        System.out.println("Danh sách bệnh nhân");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()){
            System.out.println("Khoa: " + entry.getKey());
            System.out.println("Bệnh nhân: " + entry.getValue());
        }

        String mostPatient = null;
        int max = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()){
            int count = entry.getValue().size();
            if (count > max){
                max = count;
                mostPatient = entry.getKey();
            }
        }
        System.out.println("\nKhoa đông nhất: " + mostPatient+ " (" + max + " bệnh nhân)");
    }
}
