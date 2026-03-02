package PTIT_CNTT1_IT203A_Session15.Bai4;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {
    Queue<EmergencyPatient> emergency = new LinkedList<>();
    Queue<EmergencyPatient> normal = new LinkedList<>();

    public void addPatient(EmergencyPatient p){
        if (p.getPriority() == 1){
            emergency.add(p);
            System.out.println("Bệnh nhân cấp cứu: " + p);
        } else {
            normal.add(p);
            System.out.println("Bệnh nhân thường: " + p);
        }
    }

    public EmergencyPatient callNextPatient(){
        if (!emergency.isEmpty()){
            EmergencyPatient p = emergency.remove();
            System.out.println("\nGọi bệnh nhân cấp cứu: " + p);
            return p;
        }
        if (!normal.isEmpty()){
            EmergencyPatient p = normal.remove();
            System.out.println("\nGọi bệnh nhân thường: " + p);
            return p;
        }
        System.out.println("\nKhông còn bệnh nhân");
        return null;
    }

    public void displayQueue(){
        System.out.println("\nDanh sách chờ khám");
        System.out.println("Bệnh nhân cấp cứu");
        if (emergency.isEmpty()){
            System.out.println("Không có bệnh nhân cấp cứu");
        } else {
            emergency.forEach(System.out::println);
        }
        System.out.println("\nBệnh nhân thường");
        if (normal.isEmpty()){
            System.out.println("Không có bệnh nhân thường");
        } else {
            normal.forEach(System.out::println);
        }
    }
}
