package PTIT_CNTT1_IT203A_Session15.Bai6;

import java.util.Stack;

public class MedicalRecordHistory {
    Stack<EditAction> editStack = new Stack<>();
    String recordId;

    public MedicalRecordHistory(String recordId){
        this.recordId =recordId;
    }

    public void addEdit(EditAction action){
        editStack.push(action);
    }

    public EditAction undo(){
        if (editStack.isEmpty()){
            return null;
        }
        return editStack.pop();
    }

    public boolean isEmpty(){
        return editStack.isEmpty();
    }

    public void display(){
        System.out.println("Lịch sử sửa bệnh án " + recordId);
        editStack.forEach(System.out::println);
    }
}
