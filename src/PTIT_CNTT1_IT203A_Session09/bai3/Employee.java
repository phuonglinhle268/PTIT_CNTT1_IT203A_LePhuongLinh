package PTIT_CNTT1_IT203A_Session09.bai3;

public class Employee {
    private String employeeName;
    private double salary;

   // public Employee() {}

    public Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Lương: " + salary);
    }
}
