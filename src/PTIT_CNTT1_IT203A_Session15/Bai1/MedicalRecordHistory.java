package PTIT_CNTT1_IT203A_Session15.Bai1;

import java.util.Stack;

public class MedicalRecordHistory {
    Stack<EditAction> history = new Stack<>();

    public void addEdit(EditAction action){
        history.push(action);
        System.out.println("Thêm chỉnh sửa: " + action);
    }

    public EditAction undoEdit(){
        if (history.isEmpty()){
            System.out.println("Không có chỉnh sửa");
            return null;
        }
        EditAction last= history.pop();
        System.out.println("\nUndo chỉnh sửa: " + last);
        return last;
    }

    public EditAction getLastestEdit(){
        if (history.isEmpty()){
            return null;
        }
        return history.peek();
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }

    public void displayHistory(){
        System.out.println("\nLịch sử chỉnh sửa bệnh án");
        if (history.isEmpty()){
            System.out.println("Không có chỉnh sửa");
            return ;
        }
        for (int i = history.size()-1; i>=0; i--){
            System.out.println(history.get(i));
        }
    }
}
