package PTIT_CNTT1_IT203A_Session14.bai5;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Comparator :
        // severity tăng dần
        // arrivalTime tăng dần
        Comparator<Patient> patientComparator = (p1, p2) ->{
            if (p1.severity != p2.severity){
                return Integer.compare(p1.severity, p2.severity);
            }
            return Integer.compare(p1.arrivalTime, p2.arrivalTime);
        };

        TreeSet<Patient> patientList = new TreeSet<>(patientComparator);

        patientList.add(new Patient("Bênh nhân A", 3, 1000));
        patientList.add(new Patient("Bênh nhân B", 1, 945));
        patientList.add(new Patient("Bênh nhân C", 3, 800));
        patientList.add(new Patient("Bênh nhân D", 2, 820));

        System.out.println("Thứ tự cấp cứu: ");
        for (Patient p : patientList){
            System.out.println(p);
        }
    }
}
