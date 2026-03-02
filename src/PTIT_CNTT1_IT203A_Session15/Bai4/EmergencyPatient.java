package PTIT_CNTT1_IT203A_Session15.Bai4;

public class EmergencyPatient {
    String id;
    String name;
    int priority;

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        String p = (priority == 1 ? "Cấp cứu" : "Thường");
        return id + " - " + name + " (" + p + ")";
    }
}

