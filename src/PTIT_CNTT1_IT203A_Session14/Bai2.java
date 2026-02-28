package PTIT_CNTT1_IT203A_Session14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Map<String, String> name = new HashMap<>();
        name.put("T01", "Paracetamol");
        name.put("T02", "Ibuprofen");
        name.put("T03", "Canxi");
        name.put("T04", "Cảm xuân hương");
        name.put("T05", "Vitamin C");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã thuốc: ");
        String id = scanner.nextLine().trim();

        //ktra có chưa
        if (name.containsKey(id)){
            System.out.println("Tên thuốc: " + name.get(id));
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT");
        }
    }
}
