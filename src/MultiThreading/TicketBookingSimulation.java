package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketBookingSystem {
    int availableTickets;
    private final Lock lock;

    public TicketBookingSystem(int totalTickets) {
        availableTickets = totalTickets;
        lock = new ReentrantLock();
    }

    public boolean bookTicket(int numTickets) {
        lock.lock();
        try {
            if (availableTickets >= numTickets) {
                // Simulating some processing time
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                availableTickets -= numTickets;
                System.out.println(Thread.currentThread().getName() + " booked " + numTickets + " ticket(s).");
                return true;
            } else {
                System.out.println(Thread.currentThread().getName() + " could not book tickets. Available tickets: " + availableTickets);
                return false;
            }
        } finally {
            lock.unlock();
        }
    }
}

class BookingThread extends Thread {
    private TicketBookingSystem bookingSystem;
    private int numTickets;

    public BookingThread(TicketBookingSystem bookingSystem, int numTickets) {
        this.bookingSystem = bookingSystem;
        this.numTickets = numTickets;
    }

    @Override
    public void run() {
        boolean success = bookingSystem.bookTicket(numTickets);
        if (!success) {
            System.out.println(Thread.currentThread().getName() + " is retrying to book tickets...");
            start();
        }
    }
}

public class TicketBookingSimulation {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(10);

        int numThreads = 5;
        BookingThread[] threads = new BookingThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new BookingThread(bookingSystem, 2);
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Remaining tickets: " + bookingSystem.availableTickets);
    }
}

