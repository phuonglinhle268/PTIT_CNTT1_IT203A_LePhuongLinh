package PTIT_CNTT1_IT203A_Session16;

import java.util.LinkedList;
import java.util.Queue;

class SpaQueue<T> {
    private Queue<T> waitingQueue;

    public SpaQueue() {
        waitingQueue = new LinkedList<>();
    }

    public void receive(T item) {
        waitingQueue.offer(item);
        System.out.println("Da tiep nhan vao Spa: " + item);
    }

    // Xu ly theo FIFO
    public T serve() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Khong co doi tuong nao dang cho Spa.");
            return null;
        }

        T currentItem = waitingQueue.peek();
        waitingQueue.remove();

        System.out.println("Dang phuc vu: " + currentItem);
        return currentItem;
    }

    public void showWaitingList() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Danh sach cho Spa trong.");
            return;
        }

        System.out.println("Danh sach dang cho Spa:");
        for (T item : waitingQueue) {
            System.out.println(item);
        }
    }
}