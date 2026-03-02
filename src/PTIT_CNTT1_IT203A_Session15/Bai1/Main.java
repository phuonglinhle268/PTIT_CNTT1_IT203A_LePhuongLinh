package PTIT_CNTT1_IT203A_Session15.Bai1;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Cập nhật cho bệnh nhân 1", "8:00"));
        history.addEdit(new EditAction("Cập nhật cho bệnh nhân 2", "10:00"));
        history.addEdit(new EditAction("Cập nhật cho bệnh nhân 3", "15:30"));

        history.displayHistory();

        System.out.println("\nChỉnh sửa mới nhất: " + history.getLastestEdit());
        history.undoEdit();
        history.displayHistory();
    }
}
