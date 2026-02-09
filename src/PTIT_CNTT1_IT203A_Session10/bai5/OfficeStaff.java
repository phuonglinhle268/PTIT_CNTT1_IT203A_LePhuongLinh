package PTIT_CNTT1_IT203A_Session10.bai5;

public class OfficeStaff extends Employee{
    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary(){
        return baseSalary;
    }
}
