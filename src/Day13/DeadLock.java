package Day13;

public class DeadLock {
    public static void main(String[] args) {
        String resource1="Resource1";
        String resource2="Resource2";

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 acquired resource 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1 acquired resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 acquired resource 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 2 acquired resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Execution completed.");
    }
}
