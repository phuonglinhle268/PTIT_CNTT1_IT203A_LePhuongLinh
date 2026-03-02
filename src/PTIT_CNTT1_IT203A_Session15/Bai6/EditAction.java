package PTIT_CNTT1_IT203A_Session15.Bai6;

public class EditAction {
    String description;
    String editedBy;
    String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    public String getDescription() {
        return description;
    }

    public String getEditedBy() {
        return editedBy;
    }

    public String getEditTime() {
        return editTime;
    }

    @Override
    public String toString() {
        return editTime + " - " + description + " - " + editedBy;
    }
}
