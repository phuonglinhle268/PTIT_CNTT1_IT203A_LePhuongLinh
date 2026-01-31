package PTIT_CNTT1_IT203A_Session06;

public class session06_bai4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmployeeID("NV01");
        emp1.setFullname("Nguyen Van A");
        emp1.setSalary(1000000);

        // mã và tên
        Employee emp2 = new Employee("NV02", "Tran Thi B");
        emp2.setSalary(9000);

        // đầy đủ
        Employee emp3 = new Employee("NV03", "Le Van C", 10000);

        emp1.employeeInfo();
        System.out.println(" ");

        emp2.employeeInfo();
        System.out.println(" ");

        emp3.employeeInfo();

    }
}
