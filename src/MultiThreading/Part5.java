package MultiThreading;

public class Part5 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() { // thread 0
                for (int i = 0; i < 10; i++) {
                    Thread t0=Thread.currentThread();
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                    try {
                        Thread.sleep(5000); // thread 0 sleeped
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        });
        thread.start();

        try {
            Thread.sleep(5000); // main thread sleep
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt(); // interrpput calln//
    }
}
