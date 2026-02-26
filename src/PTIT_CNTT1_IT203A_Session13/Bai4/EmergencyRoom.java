package PTIT_CNTT1_IT203A_Session13.Bai4;

import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> queue = new LinkedList<>();

    //bệnh nhân thường
    public void patientCheckIn(String name){
        queue.addLast(name);
    }

    //cấp cứu nguy kịch
    public void emergencyCheckIn(String name){
        queue.addFirst(name);
    }

    //bác sĩ gọi vào phòng
    public void treatPatient(){
        if (queue.isEmpty()){
            System.out.println("Không có bệnh nhân");
            return;
        }
        String name = queue.removeFirst();

        if (name.equals("C")) {
            System.out.println("Đang cấp cứu: " + name);
        } else {
            System.out.println("Đang khám: " + name);
        }
    }
}
