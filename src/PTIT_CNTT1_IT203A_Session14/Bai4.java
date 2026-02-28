package PTIT_CNTT1_IT203A_Session14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bai4 {
    public static void main(String[] args) {
        List<String> report = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );
        Map<String, Integer> count = new TreeMap<>();

        for (String illness : report){
            count.put(illness, count.getOrDefault(illness, 0) + 1);
        }
//        counter.getOrDefault(disease, 0)
//        Nếu bệnh đã có trong map → trả về số ca hiện có
//        Nếu bệnh chưa có trong map → trả về 0 (giá trị mặc định)
//        + 1: luôn tăng 1 khi đã có bệnh
//        .put: chưa có -> thêm, có -> update

        System.out.println("Báo cáo ca bệnh: ");
        // entrySet:trả về tập hợp các cặp key–value bên trong Map.
        //Nghĩa là thay vì chỉ lấy key hoặc value, bạn lấy được cả hai cùng lúc.
        for (Map.Entry<String, Integer> entry : count.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
