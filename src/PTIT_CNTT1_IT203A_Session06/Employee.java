package PTIT_CNTT1_IT203A_Session06;

// bài 4
public class Employee {
    private String employeeID;
    public String fullname;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeID, String fullname) {
        this.employeeID = employeeID;
        this.fullname = fullname;
    }

    public Employee(String employeeID, String fullname, double salary) {
        this.employeeID = employeeID;
        this.fullname = fullname;
        this.salary = salary;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void employeeInfo() {
        System.out.println("Mã NV: " + employeeID);
        System.out.println("Tên: " + fullname);
        System.out.println("Lương: " + salary);
    }
}
