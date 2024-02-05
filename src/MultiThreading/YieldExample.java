package MultiThreading;

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            // Yielding control to other threads
            Thread.yield();
        }
    }
}

public class YieldExample {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();

        thread1.start();
        thread2.start();
    }
}

