package PTIT_CNTT1_IT203A_Session15.Bai5;

import java.util.Stack;

public class EmergencyCase {
    Patient patient;
    Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient){
        this.patient = patient;
    }

    public Patient getPatient(){
        return patient;
    }
    public void addStep(TreatmentStep step){
        steps.push(step);
        System.out.println("\nThêm bước xử lí: "+ step);
    }

    public TreatmentStep undoStep(){
        if (steps.isEmpty()){
            System.out.println("Không có bước cần hoàn thành");
            return null;
        }
        TreatmentStep removed = steps.pop();
        System.out.println("Undo bước: " + removed);
        return removed;
    }

    public void displaySteps(){
        System.out.println("\nCác bước xử lí của bệnh nhân: " + patient.getName());
        if (steps.isEmpty()){
            System.out.println("Chưa có bước nào");
            return;
        }
        for (int i = steps.size()-1; i>=0; i--){
            System.out.println(steps.get(i));
        }
    }
}
