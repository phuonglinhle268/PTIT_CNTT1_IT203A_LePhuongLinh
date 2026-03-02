package PTIT_CNTT1_IT203A_Session15.Bai5;

public class Main {
    public static void main(String[] args) {
        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient("BN01", "Nguyễn Văn A", 45);
        Patient p2 = new Patient("BN02", "Trần Thị B", 30);

        queue.addCase(new EmergencyCase(p1));
        queue.addCase(new EmergencyCase(p2));

        // Lấy bệnh nhân đầu tiên
        EmergencyCase case1 = queue.getNextCase();
        case1.addStep(new TreatmentStep("Tiếp nhận bệnh nhân", "10:00"));
        case1.addStep(new TreatmentStep("Chẩn đoán ban đầu", "10:05"));
        case1.addStep(new TreatmentStep("Truyền dịch", "10:10"));

        case1.displaySteps();

        case1.undoStep();
        case1.displaySteps();

        // Lấy bệnh nhân tiếp theo
        EmergencyCase case2 = queue.getNextCase();
        case2.addStep(new TreatmentStep("Tiếp nhận bệnh nhân", "10:15"));
        case2.addStep(new TreatmentStep("Chụp X-quang", "10:20"));

        case2.displaySteps();
    }
}
