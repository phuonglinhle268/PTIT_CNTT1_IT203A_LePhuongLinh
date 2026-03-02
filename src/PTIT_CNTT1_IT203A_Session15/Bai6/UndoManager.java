package PTIT_CNTT1_IT203A_Session15.Bai6;

import java.util.Stack;

public class UndoManager {
    Stack<InputAction> undoStack = new Stack<>();
    int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {
        if (undoStack.size() == maxUndoSteps) {
            undoStack.remove(0); // bỏ hành động cũ nhất
        }
        undoStack.push(action);
    }

    public InputAction undo() {
        if (undoStack.isEmpty()){
            return null;
        }
        return undoStack.pop();
    }

    public void display() {
        undoStack.forEach(System.out::println);
    }
}
