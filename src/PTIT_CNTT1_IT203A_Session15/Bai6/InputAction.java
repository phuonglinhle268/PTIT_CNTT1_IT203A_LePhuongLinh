package PTIT_CNTT1_IT203A_Session15.Bai6;

public class InputAction {
    String fieldName;
    String oldValue;
    String newValue;
    String actionTime;

    public InputAction(String fieldName, String oldValue, String newValue, String actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }

    @Override
    public String toString() {
        return "[" + actionTime + "] " + fieldName +
                ": '" + oldValue + "' → '" + newValue + "'";
    }
}
