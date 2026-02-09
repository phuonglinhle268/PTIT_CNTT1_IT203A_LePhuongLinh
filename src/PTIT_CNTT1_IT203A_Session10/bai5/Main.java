package PTIT_CNTT1_IT203A_Session10.bai5;

public class Main {
    public static void main(String[] args) {
        Employee staff = new OfficeStaff("Nguyen Van A", 50000);
        Employee manager = new Manager("Nguyen Van B", 100000, 0.1);

        printSalary(staff);
        System.out.println(" ");
        printSalary(manager);
    }

    public static void printSalary(Employee e) {
        System.out.println("Tên: " + e.name);
        System.out.println("Lương cơ bản: " + e.baseSalary);

        if (e instanceof BonusCalculator) {
            BonusCalculator b = (BonusCalculator) e;
            System.out.println("Thưởng KPI: " + b.getBonus());
        } else {
            System.out.println("Không thưởng");
        }

        System.out.println("Lương nhân được: " + e.calculateSalary());
    }
}
