package PTIT_CNTT1_IT203A_Session09.bai3;

public class Manager extends Employee {
    private String department;

    public Manager(String employeeName, double salary, String department) {
        super(employeeName, salary);
        this.department = department;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Phòng ban: " + department);
    }
}
