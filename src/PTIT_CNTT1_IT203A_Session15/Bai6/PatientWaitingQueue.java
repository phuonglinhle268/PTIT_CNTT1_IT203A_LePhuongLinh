package PTIT_CNTT1_IT203A_Session15.Bai6;

import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {
    Queue<Patient> waitingQueue = new LinkedList<>();
    int total = 0;

    public void enqueue(Patient p){
        waitingQueue.add(p);
        total++;
    }

    public Patient dequeue(){
        if (waitingQueue.isEmpty()){
            return null;
        }
        total--;
        return waitingQueue.remove();
    }

    public Patient peek(){
        return waitingQueue.peek();
    }

    public boolean isEmpty(){
        return waitingQueue.isEmpty();
    }

    public void display(){
        System.out.println("Danh sách bệnh nhân chờ");
        waitingQueue.forEach(System.out::println);
    }
}
