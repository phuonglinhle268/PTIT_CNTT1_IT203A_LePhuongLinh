package PTIT_CNTT1_IT203A_Session09.bai5;

public class OfficeEmployee extends Employee {
    private double salary;
    private double bonus;

    public OfficeEmployee(String name, double salary, double bonus) {
        super(name);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return salary + bonus;
    }
}
