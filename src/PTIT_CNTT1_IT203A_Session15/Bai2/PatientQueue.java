package PTIT_CNTT1_IT203A_Session15.Bai2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    Queue<Patient> queue = new LinkedList<>();

    public void addPatient(Patient p){
        queue.add(p);
        System.out.println("\nTiếp nhận: " + p);
    }

    public Patient callNextPatient(){
        if (queue.isEmpty()){
            System.out.println("Không còn bênh nhân");
            return null;
        }
        Patient next = queue.remove();
        System.out.println("\nBệnh nhân tiếp: " + next);
        return next;
    }

    public Patient peekNextPatient(){
        if (queue.isEmpty()){
            return null;
        }
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void displayQueue(){
        System.out.println("\nDanh sách bệnh nhân đang chờ");
        if (queue.isEmpty()){
            System.out.println("Không có bênh nhân");
            return;
        }
        for (Patient p : queue){
            System.out.println(p);
        }
    }
}
