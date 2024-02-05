package MultiThreading;

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThread2 thread1 = new MyThread2();
        MyThread2 thread2 = new MyThread2();

        thread1.start();

        try {
            // Wait for thread1 to complete before starting thread2
//            thread1.join();
            thread1.join( 10000); //wait maximum 10sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}

