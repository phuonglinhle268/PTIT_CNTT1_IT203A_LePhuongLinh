package PTIT_CNTT1_IT203A_Session10.bai5;

public class Manager extends Employee implements BonusCalculator{
    private double kpi;

    public Manager(String name, double baseSalary, double kpi) {
        super(name, baseSalary);
        this.kpi = kpi;
    }

    @Override
    public double getBonus(){
        return baseSalary * kpi;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + getBonus();
    }
}
