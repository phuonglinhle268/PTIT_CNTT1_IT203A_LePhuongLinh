package PTIT_CNTT1_IT203A_Session15.Bai4;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(new EmergencyPatient("BN01", "Nguyễn Văn A", 1));
        eq.addPatient(new EmergencyPatient("BN02", "Trần Thị B", 1));
        eq.addPatient(new EmergencyPatient("BN03", "Lê Văn C", 2));
        eq.addPatient(new EmergencyPatient("BN04", "Phạm Văn D", 1));

        eq.displayQueue();

        eq.callNextPatient(); // ưu tiên cấp cứu
        eq.callNextPatient(); // tiếp tục cấp cứu
        eq.callNextPatient(); // bệnh nhân thường
        eq.callNextPatient();

        eq.callNextPatient(); // hết bệnh nhân
    }
}
