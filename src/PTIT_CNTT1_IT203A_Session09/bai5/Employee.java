package PTIT_CNTT1_IT203A_Session09.bai5;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    // phương thức trừu tượng để buộc lớp con override
    public double calculateSalary() {
        return 0;
    }

    public String getName() {
        return name;
    }
}
