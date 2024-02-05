package MultiThreading;

public class DaemonThreadExample {
    public static void main(String[] args) {
        // Create a daemon thread
        Thread daemonThread = new Thread(new DaemonTask());

        System.out.println(daemonThread.isDaemon()); // by default 'false'
        // Set the thread as daemon
        daemonThread.setDaemon(true);


        // Start the daemon thread
        daemonThread.start();

        // The main thread continues with its tasks
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread has finished.");
        // Since the main thread has finished, the daemon thread will be terminated if it's still running.
    }
}

class DaemonTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

