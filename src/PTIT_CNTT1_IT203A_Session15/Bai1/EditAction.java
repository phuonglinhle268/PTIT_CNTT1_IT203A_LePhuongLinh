package PTIT_CNTT1_IT203A_Session15.Bai1;

public class EditAction {
    String description;
    String time;

    public EditAction(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString(){
        return description + " - " + time;
    }
}
