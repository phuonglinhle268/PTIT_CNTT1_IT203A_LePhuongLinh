package PTIT_CNTT1_IT203A_Session15.Bai6;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
    Queue<Ticket> ticketQueue = new LinkedList<>();
    int currentNum = 0;

    public Ticket issueTicket(String time){
        Ticket t = new Ticket(++currentNum, time);
        ticketQueue.add(t);
        return t;
    }

    public Ticket callNext(){
        if (ticketQueue.isEmpty()){
            return null;
        }
        return ticketQueue.remove();
    }

    public void displayQueue(){
        ticketQueue.forEach(System.out::println);
    }
}
