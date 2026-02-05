package PTIT_CNTT1_IT203A_Session09.bai5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        // Thêm nhân viên vào danh sách
        list.add(new OfficeEmployee("nhân viên 1", 60000, 10000));
        list.add(new ProductionEmployee("nhân viên 2", 10, 20000));

        double totalSalary = 0;

        for (Employee e : list) {
            System.out.println(e.getName() + " => " + e.calculateSalary());
            totalSalary += e.calculateSalary();
        }

        System.out.println("\nTổng lương phải trả: " + totalSalary);
    }
}
