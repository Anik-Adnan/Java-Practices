package MultiThreading;

public class TwoThreadShutdownHookExample {
    public static void main(String[] args) {
        // Create instances of two threads
        Thread thread1 = new Thread(new WorkerThread("Thread 1"));
        Thread thread2 = new Thread(new WorkerThread("Thread 2"));

        //remve shutdownhook
//        Runtime.getRuntime().removeShutdownHook(thread1);
        // Register a shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown hook is running...");

            // Perform cleanup or resource release tasks here
            System.out.println("Cleaning up resources...");

            // Interrupt the threads to signal them to stop
            thread1.interrupt();
            thread2.interrupt();

            System.out.println("Shutdown hook has finished.");
        }));

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

class WorkerThread implements Runnable {
    private final String name;

    public WorkerThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                // Simulate some work
                System.out.println(name + " is doing some work...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted and will exit.");
        }
    }
}

