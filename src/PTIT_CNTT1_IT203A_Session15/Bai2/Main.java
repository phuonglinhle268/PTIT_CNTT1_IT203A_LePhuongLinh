package PTIT_CNTT1_IT203A_Session15.Bai2;

public class Main {
    public static void main(String[] args) {
        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("BN01", "Nguyễn Văn A", 30));
        pq.addPatient(new Patient("BN02", "Trần Thị B", 25));
        pq.addPatient(new Patient("BN03", "Lê Văn C", 40));

        pq.displayQueue();

        System.out.println("Bệnh nhân tiếp theo: " + pq.peekNextPatient());

        pq.callNextPatient();
        pq.displayQueue();

        pq.callNextPatient();
        pq.callNextPatient();

        pq.callNextPatient(); // Không còn ai → báo
    }
}
