package PTIT_CNTT1_IT203A_Session15.Bai6;

public class Ticket {
    int ticketNumber;
    String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    @Override
    public String toString() {
        return "Số: " + ticketNumber + " - " + issuedTime;
    }
}
