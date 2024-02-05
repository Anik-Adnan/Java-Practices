package MultiThreading;

public class Wait_Notify_example {
    public static void main(String[] args) {
        Wait_Notify_example obj=new Wait_Notify_example();

        Thread t1=new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 10; i++) {
                            System.out.println(Thread.currentThread().getName()+" -> "+i);
                            try{
                                if (i==5){
                                    synchronized (obj){ // 'obj' monitoring object. without it illegalMonitorStateException
                                        // make lock
                                        obj.wait();
                                        // release lock
                                        }
                                    }
                                }
                            catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                },"Our-Thread");
        t1.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (obj){
            // lock
            obj.notify(); // notify
            // release lock
        }
        System.out.println("notify called");

    }
}
