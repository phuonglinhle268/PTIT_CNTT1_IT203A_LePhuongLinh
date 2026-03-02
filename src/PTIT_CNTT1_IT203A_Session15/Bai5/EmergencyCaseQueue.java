package PTIT_CNTT1_IT203A_Session15.Bai5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    Queue<EmergencyCase> cases = new LinkedList<>();

    public void addCase(EmergencyCase c){
        cases.add(c);
        System.out.println("Thêm ca cấp cứu: " + c.getPatient().getName());
    }

    public EmergencyCase getNextCase(){
        if (cases.isEmpty()){
            System.out.println("Không còn bệnh nhân");
            return null;
        }
        EmergencyCase c = cases.remove();
        System.out.println("Xử lí ca bệnh: " + c.getPatient().getName());
        return c;
    }
}
