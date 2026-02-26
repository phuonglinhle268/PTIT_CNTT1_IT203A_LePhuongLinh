package PTIT_CNTT1_IT203A_Session13.Bai4;

public class Main {
    public static void main(String[] args) {
        EmergencyRoom p = new EmergencyRoom();

        p.patientCheckIn("A");
        p.patientCheckIn("B");
        p.emergencyCheckIn("C");

        // Bác sĩ gọi bệnh nhân 3 lần
        p.treatPatient();
        p.treatPatient();
        p.treatPatient();
    }
}
